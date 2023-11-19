import java.sql.*;
public class pr18Ex2 {
    public static void main(String[] args) throws SQLException ,ClassNotFoundException{
    String url = "jdbc:mysql://localhost:3306/student";
    String username = "root";
    String password = "Admin@123";
    String createTable = "CREATE TABLE employee("+"emp_id INT AUTO_INCREMENT PRIMARY KEY,"+"emp_name VARCHAR(255))";
    String insertQuery = "INSERT INTO employee (emp_name) VALUES('SAI'),('OM')";
    
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connection = DriverManager.getConnection(url, username, password);
    Statement statement = connection.createStatement();
    statement.executeUpdate(createTable);
    System.out.println("table createed SuccessFully");
    statement.executeUpdate(insertQuery);
    System.out.println("data inserted successfully");
    statement.close();
    connection.close();
    }
}
