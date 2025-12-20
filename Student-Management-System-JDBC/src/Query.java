public class Query {

    // SQL insert query
    public static String create(String table) {
        return "INSERT INTO " + table + " (St_Id, St_Name, marks, city) VALUES (?, ?, ?, ?)";
    }

    // SQL select query
    public static String read(String table) {
        return "SELECT * FROM " + table;
    }

    // SQL update query
    public static String update(String table, String column) {
        return "UPDATE " + table + " SET " + column + " = ? WHERE St_Id = ?";
    }

    // SQL delete query
    public static String delete(String table) {
        return "DELETE FROM " + table + " WHERE St_Id = ?";
    }

}