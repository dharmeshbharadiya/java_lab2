import java.sql.*;

public class Prog4{
    public static void main(String[] args){
        Connection conn = null;
        
        String url ="jdbc:mysql://localhost:3306/employee";
        try{
            conn = DriverManager.getConnection(url, "root", "tnrao");
            
            String sql="update emp set firstname =? where lastname =?";

            PreparedStatement pt = conn.prepareStatement(sql);
            pt.setString(1, "dharmesh");
            pt.setString(2, "nirav");
            int val = pt.executeUpdate();
            if(val > 0){
                System.out.println("updated......");
            }
            
            pt.close();
            conn.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}