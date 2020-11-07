package practice7;

import java.sql.*;

public class DatabaseConnectivityPrac1 {
    public static void main(String[] args) throws SQLException {

        String username = "root";
        String password = "root1234";
        String dataBaseName = "peopleandtech";
        String query = "select * from students";
        String url = "jdbc:mysql://localhost:3306/" + dataBaseName;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);


        while (resultSet.next()) {
            Student student = new Student();
            student.setName(resultSet.getString("name"));
            student.setId(resultSet.getInt("id"));
            student.setLocation(resultSet.getString("location"));
            System.out.println(student.toString());


        }


        connection.close();
        statement.close();
    }
}
