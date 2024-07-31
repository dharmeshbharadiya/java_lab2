import java.sql.*;
class prog1{
    public static void main(String[] args)
    {
        Connection conn;
        Statement stmt;
        String url ="jdbc:mysql://localhost:3306/employee";
        try
        {
            conn = DriverManager.getConnection(url, "root", "tnrao");
            stmt =conn.createStatement();
            String sql ="insert into emp values(5,'lopa','sharma','clerk')";
            int val = stmt.executeUpdate(sql);
            System.out.println(val +"insert successfully");
            stmt.close();
            conn.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        
    }
}