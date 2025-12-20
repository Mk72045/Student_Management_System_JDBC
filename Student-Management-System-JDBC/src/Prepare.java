import java.sql.PreparedStatement;

public class Prepare {

    // Preparing Statement to insert data into database 
    public static PreparedStatement insertStm(String table, Student student) throws Exception {
        String createQry = Query.create(table);
        PreparedStatement ps = Conn.connect().prepareStatement(createQry);
        ps.setInt(1, student.getId());
        ps.setString(2, student.getName());
        ps.setInt(3, student.getMarks());
        ps.setString(4, student.getCity());

        return ps;
    }

    // Preparing Statement to read data from database 
    public static PreparedStatement readStm(String table) throws Exception {
        String readQry = Query.read(table);
        PreparedStatement ps = Conn.connect().prepareStatement(readQry);

        return ps;
    }

    // Preparing Statement to update data into database 
    public static PreparedStatement updateStm(String table, String column, String setValue, int idValue)
            throws Exception {
        String updateQry = Query.update(table, column);
        PreparedStatement ps = Conn.connect().prepareStatement(updateQry);
        ps.setString(1, setValue);
        ps.setInt(2, idValue);

        return ps;
    }

    // Preparing Statement to delete data from database 
    public static PreparedStatement deleteStm(String table, int idValue) throws Exception {
        String deleteQry = Query.delete(table);
        PreparedStatement ps = Conn.connect().prepareStatement(deleteQry);
        ps.setInt(1, idValue);

        return ps;
    }
}
