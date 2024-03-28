package client;

import client.db.entity.T0nj0547;


import client.db.entity.T0nj0547d;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.sql.Connection;

import java.sql.SQLException;

import java.util.List;

import javax.naming.InitialContext;

import javax.naming.NamingException;

import javax.sql.DataSource;

import javax.ws.rs.Consumes;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/")
public class T0nj0547ServiceImp implements T0nj0547Service {
    private Connection conn;
    private final String ACCESSKEY = "eHh4eHh4Onl5eXl5eQ";
    private String resp = "";

    public T0nj0547ServiceImp() throws NamingException, SQLException {
        super();
        InitialContext ic = new InitialContext();
        DataSource ds = (DataSource) ic.lookup("java:comp/env/jdbc/t078DS");
        conn = ds.getConnection();
        conn.setAutoCommit(true);
    }

    @Override
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    @Path("/add")
    public Response addT0nj0547(String payload, @HeaderParam("accesskey") String authString) {
//        System.out.println(authString);
        try {
            if (authString == null || authString.isEmpty()) {
                resp = "{\"error\":\"Accesskey is invalid\"}";
                return Response.status(Response.Status.UNAUTHORIZED)
                               .entity(resp)
                               .build();
            }
            if (!ACCESSKEY.equals(authString)) {
                resp = "{\"error\":\"Accesskey is invalid\"}";
                return Response.status(Response.Status.UNAUTHORIZED)
                               .entity(resp)
                               .build();
            }
            // 將payload轉換為T0nj0547物件(反序列化將json轉成java物件)
            ObjectMapper objectMapper = new ObjectMapper();
            
            T0nj0547 t0nj0547 = objectMapper.readValue(payload, T0nj0547.class);

            InsertDbT0nj0547 insT0nj0547 = new InsertDbT0nj0547(conn, t0nj0547);
            insT0nj0547.InsertDbT0nj0547();
            List<T0nj0547d> t0nj0547d = t0nj0547.getT0nj0547d();
            if (t0nj0547d.size() > 0) {
//                System.out.println(t0nj0547.getBussrfno());
                InsertDbT0nj0547d insT0nj0547d = new InsertDbT0nj0547d(conn, t0nj0547d,t0nj0547.getBussrfno(),t0nj0547.getRegofc());
                insT0nj0547d.InsertDbT0nj0547d();
            }

            resp = "{\"message\":\"資料已新增\",\"status\":\"" + Response.Status.CREATED + "\"}";
            return Response.status(Response.Status.CREATED)
                           .entity(resp)
                           .build();
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
            String resp = "{\"message\":\"" + ex.getMessage().replace("\"", "\'") + "\"}";
            return Response.status(Response.Status.BAD_REQUEST)
                           .entity(resp)
                           .build();
        } catch (Exception e) {
            // TODO: Add catch code
//            e.printStackTrace();
            System.out.println(e.getMessage());
            String resp = "{\"message\":\"" + e.getMessage().replace("\"", "\'") + "\"}";
            return Response.status(Response.Status.BAD_REQUEST)
                           .entity(resp)
                           .build();
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    System.out.println("連線DB發生錯誤");
                }
            }
        }
    }
}
