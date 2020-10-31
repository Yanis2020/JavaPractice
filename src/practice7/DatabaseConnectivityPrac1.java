package training;

//import com.mysql.cj.jdbc.ha.MultiHostMySQLConnection;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseConnectivityPrac1 {
    public static void main(String[] args) throws SQLException {

            String username = "root";
            String password = "root1234";
            String dataBaseName = "peopleandtech";
            String query= "select * from students";
            String url = "jdbc:mysql://localhost:3306/" + dataBaseName;

            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement= connection.createStatement();
            ResultSet resultSet=statement.executeQuery(query);

            ArrayList<ArrayList<Object>> studentInfo = new ArrayList<>();
            while (resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String location = resultSet.getString("location");


                ArrayList<Object> student = new ArrayList<>();
                student.add(id);
                student.add(name);
                student.add(location);
                studentInfo.add(student);
                System.out.println(student);
            }
            System.out.println(studentInfo);

        connection.close();
        statement.close();
    }
}
