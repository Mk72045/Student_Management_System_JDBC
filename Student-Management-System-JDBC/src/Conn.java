import java.sql.Connection;
import java.sql.DriverManager;

public class Conn {
    // creating static connection
    private static Connection con;

    // creating constant variables
    private static final String db = "Student_Management_System";
    private static final String url = "jdbc:mysql://localhost:3306/";
    private static final String user = "root";
    private static final String pass = System.getenv("DB_PASS");

    // function to make connection from java to database
    public static Connection connect() throws Exception {
        if(con == null || con.isClosed()) {
            con = DriverManager.getConnection(url+db, user, pass);
        }
        return con;
    }
}