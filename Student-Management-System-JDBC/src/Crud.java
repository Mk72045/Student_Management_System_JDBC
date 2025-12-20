import java.sql.PreparedStatement;
// import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;

public class Crud {
    // creating variables to store Prepared Statements from Prepare.java file
    private static PreparedStatement insertStm;
    private static PreparedStatement updateStm;
    private static PreparedStatement readStm;
    private static PreparedStatement deleteStm;

    // function to execute or perform insert query 
    public static void executeCreate(String table, Student st) throws Exception {
        insertStm = Prepare.insertStm(table, st);
        insertStm.executeUpdate();

        insertStm.close();
    }

    // function to execute or perform read or select query
    public static ArrayList<Student> executeRead(String table) throws Exception {
        ArrayList<Student> list = new ArrayList<>();
        readStm = Prepare.readStm(table);
        ResultSet rs = readStm.executeQuery();

        while(rs.next()) {
            Student data = new Student(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4));
            list.add(data);
        } 
        readStm.close();
        return list;
    }

    // function to execute or perform update query
    public static void executeUpdate(String table, String column, String setValue, int idValue) throws Exception {
        updateStm = Prepare.updateStm(table, column, setValue, idValue);
        updateStm.executeUpdate();

        updateStm.close();
    }

    // function to execute or perform delete query
    public static void executeDelete(String table, int idValue) throws Exception {
        deleteStm = Prepare.deleteStm(table, idValue);
        deleteStm.executeUpdate();

        deleteStm.close();
    }
}
