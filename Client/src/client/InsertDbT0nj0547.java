package client;

import client.db.entity.T0nj0547;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.sql.Timestamp;

import java.util.Date;

public class InsertDbT0nj0547 {
    private Connection conn = null;
    private T0nj0547 t0nj0547;

    public InsertDbT0nj0547() {
    }
    //CONSTRUCTOR
    public InsertDbT0nj0547(Connection conn, T0nj0547 t0nj0547) {
        this.conn = conn;
        this.t0nj0547 = t0nj0547;
    }

    protected void InsertDbT0nj0547() throws SQLException {
        Date date = new Date(System.currentTimeMillis());
        Timestamp today = new Timestamp(date.getTime());
        String sql =
            "INSERT INTO t0nj0547(bussrfno, bussnm, costsid, costsidcomt, regofc, regofccomt, busslocation, txdat) " +
            "VALUES (?,?,?,?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, t0nj0547.getBussrfno());
        ps.setString(2, t0nj0547.getBussnm());
        ps.setString(3, t0nj0547.getCostsid());
        ps.setString(4, t0nj0547.getCostsidcomt());
        ps.setString(5, t0nj0547.getRegofc());
        ps.setString(6, t0nj0547.getRegofccomt());
        ps.setString(7, t0nj0547.getBusslocation());
        ps.setTimestamp(8, today);
        ps.execute();
        ps.close();
    }
}
