package test0626;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class DBConnect 
{
    
    public static Connection connect()
    {
        Connection conn = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/Test0626","root","");
        }catch(Exception e)
        {
            System.out.println(e);
        }
        return conn;
    }
}
