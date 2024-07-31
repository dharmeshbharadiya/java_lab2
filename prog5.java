import java.sql.*;

public class Prog4{
    public static void main(String[] args){
        Connection conn = null;
        PreparedStatement pstmt = null;
        String url ="jdbc:mysql://localhost:3306/employee";
        try{
            conn = DriverManager.getConnection(url, "root", "tnrao");
            System.out.println("Creating prepared statement...");

            String sql="DELETE FROM emp WHERE firstname =?";
            pstmt = conn.prepareStatement(sql);
           
            pt.setString(1, "kashayap");
            pt.setString(2, "nirav");
            int val = pstmt.executeUpdate();
            System.out.println(val+"record(s) deleted successfully");
            pstmt.close();
            
            conn.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}