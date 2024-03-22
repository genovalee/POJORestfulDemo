# POJO RESTFul Api 程式撰寫、測試及部署 
## 建立 MD 資料表

MASTER TABLE:
<pre style="color:#000000;background:#ffffff;">Create table t0nj0547 
<span style="color:#808030; ">(</span> 
  BUSSRFNO     VARCHAR2<span style="color:#808030; ">(</span><span style="color:#008c00; ">8</span><span style="color:#808030; ">)</span><span style="color:#808030; ">,</span>           <span style="color:#808030; ">-</span><span style="color:#808030; ">-</span>商業統一編號  
  BUSSNM       VARCHAR2<span style="color:#808030; ">(</span><span style="color:#008c00; ">255</span><span style="color:#808030; ">)</span><span style="color:#808030; ">,</span>         <span style="color:#808030; ">-</span><span style="color:#808030; ">-</span>商業名稱  
  COSTSID      VARCHAR2<span style="color:#808030; ">(</span><span style="color:#008c00; ">2</span><span style="color:#808030; ">)</span><span style="color:#808030; ">,</span>           <span style="color:#808030; ">-</span><span style="color:#808030; ">-</span>公司狀態代碼  
  COSTSIDCOMT  VARCHAR2<span style="color:#808030; ">(</span><span style="color:#008c00; ">255</span><span style="color:#808030; ">)</span><span style="color:#808030; ">,</span>         <span style="color:#808030; ">-</span><span style="color:#808030; ">-</span>公司狀態說明  
  REGOFC       VARCHAR2<span style="color:#808030; ">(</span><span style="color:#008c00; ">15</span><span style="color:#808030; ">)</span><span style="color:#808030; ">,</span>          <span style="color:#808030; ">-</span><span style="color:#808030; ">-</span>登記機關  
  REGOFCCOMT   VARCHAR2<span style="color:#808030; ">(</span><span style="color:#008c00; ">255</span><span style="color:#808030; ">)</span><span style="color:#808030; ">,</span>         <span style="color:#808030; ">-</span><span style="color:#808030; ">-</span>登記機關說明<span style="color:#808030; ">  
  BUSSLOCATION VARCHAR2<span style="color:#808030; ">(</span><span style="color:#008c00; ">512</span><span style="color:#808030; ">)</span><span style="color:#808030; ">,</span>         <span style="color:#808030; ">-</span><span style="color:#808030; ">-</span>商業所在地<span style="color:#808030; ">,</span> 
  TXDAT     DATE<span style="color:#808030; ">,</span> 
  constraint PK_T0NJ0547 primary key <span style="color:#808030; ">(</span>BUSSRFNO<span style="color:#808030; ">,</span> REGOFC<span style="color:#808030; ">)</span> 
<span style="color:#808030; ">)</span><span style="color:#800080; ">;</span> 
</pre>
DETAIL TABLE

<pre style="color:#000000;background:#ffffff;">Create table t0nj0547d 
<span style="color:#808030; ">(</span> 
  BUSSRFNO  VARCHAR2<span style="color:#808030; ">(</span><span style="color:#008c00; ">8</span><span style="color:#808030; ">)</span><span style="color:#808030; ">,</span>               <span style="color:#808030; ">-</span><span style="color:#808030; ">-</span>商業統一編號  
  REGOFC    VARCHAR2<span style="color:#808030; ">(</span><span style="color:#008c00; ">255</span><span style="color:#808030; ">)</span><span style="color:#808030; ">,</span>             <span style="color:#808030; ">-</span><span style="color:#808030; ">-</span>登記機關<span style="color:#808030; "></span>  
  IT        VARCHAR2<span style="color:#808030; ">(</span><span style="color:#008c00; ">4</span><span style="color:#808030; ">)</span><span style="color:#808030; ">,</span>               <span style="color:#808030; ">-</span><span style="color:#808030; ">-</span>營業項目序號  
  SALIT     VARCHAR2<span style="color:#808030; ">(</span><span style="color:#008c00; ">10</span><span style="color:#808030; ">)</span><span style="color:#808030; ">,</span>              <span style="color:#808030; ">-</span><span style="color:#808030; ">-</span>營業項目代號  
  SALITCOMT VARCHAR2<span style="color:#808030; ">(</span><span style="color:#008c00; ">2000</span><span style="color:#808030; ">)</span><span style="color:#808030; ">,</span>            <span style="color:#808030; ">-</span><span style="color:#808030; ">-</span>營業項目名稱 
  TXDAT     DATE<span style="color:#808030; ">,</span> 
  constraint PK_T0NJ0547D primary key <span style="color:#808030; ">(</span>BUSSRFNO<span style="color:#808030; ">,</span> REGOFC<span style="color:#808030; ">,</span> SALIT<span style="color:#808030; ">)</span><span style="color:#808030; ">,</span> 
  constraint FK_T0NJ0547D foreign key <span style="color:#808030; ">(</span>BUSSRFNO<span style="color:#808030; ">,</span> REGOFC<span style="color:#808030; ">)</span> 
  references T0NJ0547 <span style="color:#808030; ">(</span>BUSSRFNO<span style="color:#808030; ">,</span> REGOFC<span style="color:#808030; ">)</span> on delete cascade 
<span style="color:#808030; ">)</span><span style="color:#800080; ">;</span> 
</pre>

## 增設Table物件，建立Java Class並宣告變數，並產生get/set method

<pre style="color:#000000;background:#ffffff;">
public class T0nj0547d{
    public T0nj0547d() {
        super()<span style="color:#800080; ">;</span>
    }
    private String bussrfno<span style="color:#800080; ">;</span>
    private String regofc<span style="color:#800080; ">;</span>
    private String it<span style="color:#800080; ">;</span>
    private String salit<span style="color:#800080; ">;</span>
    private String salitcomt<span style="color:#800080; ">;</span>
}	
</pre>


<pre style="color:#000000;background:#ffffff;">
public class T0nj0547{
    public T0nj0547() {
        super()<span style="color:#800080; ">;</span>
    }
    private String bussrfno<span style="color:#800080; ">;</span>
    private String bussnm<span style="color:#800080; ">;</span>
    private String costsid<span style="color:#800080; ">;</span>
    private String costsidcomt<span style="color:#800080; ">;</span>
    private String regofc<span style="color:#800080; ">;</span>
    private String regofccomt<span style="color:#800080; ">;</span>
    private String busslocation<span style="color:#800080; ">;</span>
    private List<span style="color:#a65700; ">&lt;</span><span style="color:#5f5035; ">T0nj0547d</span><span style="color:#a65700; ">&gt;</span> t0nj0547d<span style="color:#800080; ">;</span>
}
</pre>
## 增設Java Interface作為service post 實作之用
### post使用addT0nj0547方法

<pre style="color:#000000;background:#ffffff;">interface T0nj0547Service <span style="color:#800080; ">{</span>
    Response addT0nj0547<span style="color:#808030; ">(</span>T0nj0547 t47<span style="color:#808030; ">)</span><span style="color:#800080; ">;</span>
<span style="color:#800080; ">}</span>
</pre>
## 增設Java Class實作上面宣告的Interface
### Override addT0nj0547()

<pre style="color:#000000;background:#ffffff;">public class T0nj0547ServiceImp implements T0nj0547Service <span style="color:#800080; ">{</span>
    private Connection conn
    private final String ACCESSKEY = "eHh4eHh4Onl5eXl5eQ";
    private String resp = "";

    public T0nj0547ServiceImp<span style="color:#808030; ">(</span><span style="color:#808030; ">)</span> throws NamingException<span style="color:#808030; ">,</span> SQLException <span style="color:#800080; ">{</span>
        super<span style="color:#808030; ">(</span><span style="color:#808030; ">)</span><span style="color:#800080; ">;</span>
        InitialContext ic <span style="color:#808030; ">=</span> new InitialContext<span style="color:#808030; ">(</span><span style="color:#808030; ">)</span><span style="color:#800080; ">;</span>
        DataSource ds <span style="color:#808030; ">=</span> <span style="color:#808030; ">(</span>DataSource<span style="color:#808030; ">)</span> ic<span style="color:#808030; ">.</span>lookup<span style="color:#808030; ">(</span><span style="color:#800000; ">"</span><span style="color:#0000e6; ">java:comp/env/jdbc/XXXXDS</span><span style="color:#800000; ">"</span><span style="color:#808030; ">)</span><span style="color:#800080; ">;</span>
        conn <span style="color:#808030; ">=</span> ds<span style="color:#808030; ">.</span>getConnection<span style="color:#808030; ">(</span><span style="color:#808030; ">)</span><span style="color:#800080; ">;</span>
        conn<span style="color:#808030; ">.</span>setAutoCommit<span style="color:#808030; ">(</span>true<span style="color:#808030; ">)</span><span style="color:#800080; ">;</span>
    <span style="color:#800080; ">}</span>

	@Override
    public Response addT0nj0547<span style="color:#808030; ">(</span>T0nj0547 t47<span style="color:#808030; ">)</span> {</span>
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
            // 將payload轉換為T0nj0547物件
            ObjectMapper objectMapper = new ObjectMapper();
            T0nj0547 t0nj0547 = objectMapper.readValue(payload, T0nj0547.class);

            InsertDbT0nj0547 insT0nj0547 = new InsertDbT0nj0547(conn, t0nj0547);
            insT0nj0547.InsertDbT0nj0547();
            if (t0nj0547.getT0nj0547d().size() > 0) {
                System.out.println(t0nj0547.getBussrfno());
                InsertDbT0nj0547d insT0nj0547d = new InsertDbT0nj0547d(conn, t0nj0547.getT0nj0547d());
                insT0nj0547d.InsertDbT0nj0547d();
            }

            resp = "{\"message\":\"資料已新增\",\"status\":\"" + Response.Status.CREATED + "\"}";
            return Response.status(Response.Status.CREATED)
                           .entity(resp)
                           .build();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            String resp = "{\"message\":\"" + ex.getMessage().replace("\"", "\'") + "\"}";
            return Response.status(Response.Status.BAD_REQUEST)
                           .entity(resp)
                           .build();
        } catch (Exception e) {
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
</pre>

## 增設兩個Insert Table的類別(InsertDbT0nj0547、InsertDbT0nj0547d)

<pre style="color:#000000;background:#ffffff;">public class InsertDbT0nj0547 <span style="color:#800080; ">{</span>
    private Connection conn <span style="color:#808030; ">=</span> null<span style="color:#800080; ">;</span>
    private T0nj0547 t47<span style="color:#800080; ">;</span>

    public InsertDbT0nj0547<span style="color:#808030; ">(</span><span style="color:#808030; ">)</span> <span style="color:#800080; ">{</span>
    <span style="color:#800080; ">}</span>
    <span style="color:#696969; ">//CONSTRUCTOR</span>
    public InsertDbT0nj0547<span style="color:#808030; ">(</span>Connection conn<span style="color:#808030; ">,</span> T0nj0547 t47<span style="color:#808030; ">)</span> <span style="color:#800080; ">{</span>
        <span style="color:#800000; font-weight:bold; ">this</span><span style="color:#808030; ">.</span>conn <span style="color:#808030; ">=</span> conn<span style="color:#800080; ">;</span>
        <span style="color:#800000; font-weight:bold; ">this</span><span style="color:#808030; ">.</span>t47 <span style="color:#808030; ">=</span> t47<span style="color:#800080; ">;</span>
    <span style="color:#800080; ">}</span>

    public <span style="color:#800000; font-weight:bold; ">void</span> InsertDbT0nj0547<span style="color:#808030; ">(</span><span style="color:#808030; ">)</span> throws SQLException <span style="color:#800080; ">{</span>
        Date date <span style="color:#808030; ">=</span> new Date<span style="color:#808030; ">(</span>System<span style="color:#808030; ">.</span>currentTimeMillis<span style="color:#808030; ">(</span><span style="color:#808030; ">)</span><span style="color:#808030; ">)</span><span style="color:#800080; ">;</span>
        Timestamp today <span style="color:#808030; ">=</span> new Timestamp<span style="color:#808030; ">(</span>date<span style="color:#808030; ">.</span>getTime<span style="color:#808030; ">(</span><span style="color:#808030; ">)</span><span style="color:#808030; ">)</span><span style="color:#800080; ">;</span>
        <span style="color:#603000; ">String</span> sql <span style="color:#808030; ">=</span>
            <span style="color:#800000; ">"</span><span style="color:#0000e6; ">INSERT INTO t0nj0547(bussrfno, bussnm, costsid, costsidcomt, regofc, regofccomt, busslocation, txdat) </span><span style="color:#800000; ">"</span> <span style="color:#808030; ">+</span>
            <span style="color:#800000; ">"</span><span style="color:#0000e6; ">VALUES (?,?,?,?,?,?,?,?)</span><span style="color:#800000; ">"</span><span style="color:#800080; ">;</span>
        PreparedStatement ps <span style="color:#808030; ">=</span> conn<span style="color:#808030; ">.</span>prepareStatement<span style="color:#808030; ">(</span>sql<span style="color:#808030; ">)</span><span style="color:#800080; ">;</span>
        ps<span style="color:#808030; ">.</span>setString<span style="color:#808030; ">(</span><span style="color:#008c00; ">1</span><span style="color:#808030; ">,</span> t47<span style="color:#808030; ">.</span>getBussrfno<span style="color:#808030; ">(</span><span style="color:#808030; ">)</span><span style="color:#808030; ">)</span><span style="color:#800080; ">;</span>
        ps<span style="color:#808030; ">.</span>setString<span style="color:#808030; ">(</span><span style="color:#008c00; ">2</span><span style="color:#808030; ">,</span> t47<span style="color:#808030; ">.</span>getBussnm<span style="color:#808030; ">(</span><span style="color:#808030; ">)</span><span style="color:#808030; ">)</span><span style="color:#800080; ">;</span>
        ps<span style="color:#808030; ">.</span>setString<span style="color:#808030; ">(</span><span style="color:#008c00; ">3</span><span style="color:#808030; ">,</span> t47<span style="color:#808030; ">.</span>getCostsid<span style="color:#808030; ">(</span><span style="color:#808030; ">)</span><span style="color:#808030; ">)</span><span style="color:#800080; ">;</span>
        ps<span style="color:#808030; ">.</span>setString<span style="color:#808030; ">(</span><span style="color:#008c00; ">4</span><span style="color:#808030; ">,</span> t47<span style="color:#808030; ">.</span>getCostsidcomt<span style="color:#808030; ">(</span><span style="color:#808030; ">)</span><span style="color:#808030; ">)</span><span style="color:#800080; ">;</span>
        ps<span style="color:#808030; ">.</span>setString<span style="color:#808030; ">(</span><span style="color:#008c00; ">5</span><span style="color:#808030; ">,</span> t47<span style="color:#808030; ">.</span>getRegofc<span style="color:#808030; ">(</span><span style="color:#808030; ">)</span><span style="color:#808030; ">)</span><span style="color:#800080; ">;</span>
        ps<span style="color:#808030; ">.</span>setString<span style="color:#808030; ">(</span><span style="color:#008c00; ">6</span><span style="color:#808030; ">,</span> t47<span style="color:#808030; ">.</span>getRegofccomt<span style="color:#808030; ">(</span><span style="color:#808030; ">)</span><span style="color:#808030; ">)</span><span style="color:#800080; ">;</span>
        ps<span style="color:#808030; ">.</span>setString<span style="color:#808030; ">(</span><span style="color:#008c00; ">7</span><span style="color:#808030; ">,</span> t47<span style="color:#808030; ">.</span>getBusslocation<span style="color:#808030; ">(</span><span style="color:#808030; ">)</span><span style="color:#808030; ">)</span><span style="color:#800080; ">;</span>
        ps<span style="color:#808030; ">.</span>setTimestamp<span style="color:#808030; ">(</span><span style="color:#008c00; ">8</span><span style="color:#808030; ">,</span> today<span style="color:#808030; ">)</span><span style="color:#800080; ">;</span>
        ps<span style="color:#808030; ">.</span>execute<span style="color:#808030; ">(</span><span style="color:#808030; ">)</span><span style="color:#800080; ">;</span>
        ps<span style="color:#808030; ">.</span>close<span style="color:#808030; ">(</span><span style="color:#808030; ">)</span><span style="color:#800080; ">;</span>
    <span style="color:#800080; ">}</span>
<span style="color:#800080; ">}</span>
</pre>

<pre style="color:#000000;background:#ffffff;">public class InsertDbT0nj0547d <span style="color:#800080; ">{</span>
    private Connection conn <span style="color:#808030; ">=</span> null<span style="color:#800080; ">;</span>
    private List<span style="color:#808030; ">&lt;</span>T0nj0547d<span style="color:#808030; ">&gt;</span> t47d <span style="color:#808030; ">=</span> new ArrayList<span style="color:#808030; ">&lt;</span>T0nj0547d<span style="color:#808030; ">&gt;</span><span style="color:#808030; ">(</span><span style="color:#808030; ">)</span><span style="color:#800080; ">;</span>

    public InsertDbT0nj0547d<span style="color:#808030; ">(</span><span style="color:#808030; ">)</span> <span style="color:#800080; ">{</span>
    <span style="color:#800080; ">}</span>

    public InsertDbT0nj0547d<span style="color:#808030; ">(</span>Connection conn<span style="color:#808030; ">,</span> List<span style="color:#808030; ">&lt;</span>T0nj0547d<span style="color:#808030; ">&gt;</span> t47d<span style="color:#808030; ">)</span> <span style="color:#800080; ">{</span>
        <span style="color:#800000; font-weight:bold; ">this</span><span style="color:#808030; ">.</span>conn <span style="color:#808030; ">=</span> conn<span style="color:#800080; ">;</span>
        <span style="color:#800000; font-weight:bold; ">this</span><span style="color:#808030; ">.</span>t47d <span style="color:#808030; ">=</span> t47d<span style="color:#800080; ">;</span>
    <span style="color:#800080; ">}</span>

    public <span style="color:#800000; font-weight:bold; ">void</span> InsertDbT0nj0547d<span style="color:#808030; ">(</span><span style="color:#808030; ">)</span> throws SQLException <span style="color:#800080; ">{</span>
        Date date <span style="color:#808030; ">=</span> new Date<span style="color:#808030; ">(</span>System<span style="color:#808030; ">.</span>currentTimeMillis<span style="color:#808030; ">(</span><span style="color:#808030; ">)</span><span style="color:#808030; ">)</span><span style="color:#800080; ">;</span>
        Timestamp today <span style="color:#808030; ">=</span> new Timestamp<span style="color:#808030; ">(</span>date<span style="color:#808030; ">.</span>getTime<span style="color:#808030; ">(</span><span style="color:#808030; ">)</span><span style="color:#808030; ">)</span><span style="color:#800080; ">;</span>
        <span style="color:#603000; ">String</span> sql <span style="color:#808030; ">=</span> <span style="color:#800000; ">"</span><span style="color:#0000e6; ">INSERT INTO t0nj0547d(bussrfno, regofc, it, salit, salitcomt, txdat) VALUES (?,?,?,?,?,?)</span><span style="color:#800000; ">"</span><span style="color:#800080; ">;</span>
        PreparedStatement ps <span style="color:#808030; ">=</span> conn<span style="color:#808030; ">.</span>prepareStatement<span style="color:#808030; ">(</span>sql<span style="color:#808030; ">)</span><span style="color:#800080; ">;</span>
        <span style="color:#800000; font-weight:bold; ">for</span> <span style="color:#808030; ">(</span>T0nj0547d dt <span style="color:#800080; ">:</span> t47d<span style="color:#808030; ">)</span> <span style="color:#800080; ">{</span>
            ps<span style="color:#808030; ">.</span>setString<span style="color:#808030; ">(</span><span style="color:#008c00; ">1</span><span style="color:#808030; ">,</span> dt<span style="color:#808030; ">.</span>getBussrfno<span style="color:#808030; ">(</span><span style="color:#808030; ">)</span><span style="color:#808030; ">)</span><span style="color:#800080; ">;</span>
            ps<span style="color:#808030; ">.</span>setString<span style="color:#808030; ">(</span><span style="color:#008c00; ">2</span><span style="color:#808030; ">,</span> dt<span style="color:#808030; ">.</span>getRegofc<span style="color:#808030; ">(</span><span style="color:#808030; ">)</span><span style="color:#808030; ">)</span><span style="color:#800080; ">;</span>
            ps<span style="color:#808030; ">.</span>setString<span style="color:#808030; ">(</span><span style="color:#008c00; ">3</span><span style="color:#808030; ">,</span> dt<span style="color:#808030; ">.</span>getIt<span style="color:#808030; ">(</span><span style="color:#808030; ">)</span><span style="color:#808030; ">)</span><span style="color:#800080; ">;</span>
            ps<span style="color:#808030; ">.</span>setString<span style="color:#808030; ">(</span><span style="color:#008c00; ">4</span><span style="color:#808030; ">,</span> dt<span style="color:#808030; ">.</span>getSalit<span style="color:#808030; ">(</span><span style="color:#808030; ">)</span><span style="color:#808030; ">)</span><span style="color:#800080; ">;</span>
            ps<span style="color:#808030; ">.</span>setString<span style="color:#808030; ">(</span><span style="color:#008c00; ">5</span><span style="color:#808030; ">,</span> dt<span style="color:#808030; ">.</span>getSalitcomt<span style="color:#808030; ">(</span><span style="color:#808030; ">)</span><span style="color:#808030; ">)</span><span style="color:#800080; ">;</span>
            ps<span style="color:#808030; ">.</span>setTimestamp<span style="color:#808030; ">(</span><span style="color:#008c00; ">6</span><span style="color:#808030; ">,</span> today<span style="color:#808030; ">)</span><span style="color:#800080; ">;</span>
            ps<span style="color:#808030; ">.</span>execute<span style="color:#808030; ">(</span><span style="color:#808030; ">)</span><span style="color:#800080; ">;</span>
        <span style="color:#800080; ">}</span>
        ps<span style="color:#808030; ">.</span>close<span style="color:#808030; ">(</span><span style="color:#808030; ">)</span><span style="color:#800080; ">;</span>
    <span style="color:#800080; ">}</span>
<span style="color:#800080; ">}</span>
</pre>
