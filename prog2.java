import java.sql.*;

public class Prog2{
    public static void main(String[] args){
        Connection conn = null;
        Statement stmt =null;
        String url ="jdbc:mysql://localhost:3306/employee";
        try{
            conn = DriverManager.getConnection(url, "root", "tnrao");
            System.out.println("creating statement...");
            stmt =conn.createStatement();
            String sql="SELECT * FROM emp";
            ResultSet rs=stmt.executeQuery(sql);

            while(rs.next()){
                String fnm =rs.getString(2);
                String lnm =rs.getString(3);
                String des =rs.getString(4);

                System.out.println("fName:"+fnm);
                System.out.println("lName:"+lnm);
                System.out.println("des:"+des);
            }
            rs.close();
            stmt.close();
            conn.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}