import java.sql.*;
public class marvellousJDBC
{
    public static void main(String A[])
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MarvellousPPA","root","");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SECET * From student");

            while(rs.next())
            {
                System.out.println("rno:" + rs.getInt("rno"));
                System.out.println("Name :" + rs.getString("name"));
                System.out.println("city :" + rs.getString("city"));
                System.out.println("marks :" + rs.getInt("marks"));
            }
            rs.close();
            stmt.close();
            con.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception occured :" + e);
        }
    }
}