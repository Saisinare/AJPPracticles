
import java.sql.*;
public class pr18XQ1 {
    public static void main(String[] args) throws ClassNotFoundException , SQLException{
        String url = "jdbc:mysql://localhost:3306/student";
        String username = "root";
        String password = "Admin@123";
        String createTable = "CREATE TABLE STUDENTSs(" + "ID INT AUTO_INCREMENT PRIMARY KEY," + "NAME VARCHAR(255),"
                + "AGE INT" + ")";
        String inserRecordSQL = "INSERT INTO STUDENTSs(NAME,AGE) VALUES('SAI','17'),('OM',22), ('BOB',21)";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        statement.executeUpdate(createTable);
        System.out.println("Table created");
        statement.executeUpdate(inserRecordSQL);
        System.out.println("Record inserted into student table");
        statement.close();
        connection.close();
    }
}
