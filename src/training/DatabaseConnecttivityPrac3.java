package training;

import java.sql.*;
import java.util.ArrayList;

public class DatabaseConnecttivityPrac3 {
    public static void main(String[] args) throws SQLException {

        String username = "root";
        String password = "root1234";
        String dBName = "peopleandtech";

        String url = "jdbc:mysql://localhost:3306/" + dBName;
        String query = "select * from cities";

        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);

        ArrayList<ArrayList<Object>> CitiesInfo = new ArrayList<>();

        while (resultSet.next()) {
            int cityID = resultSet.getInt("idCities");
            String cityName = resultSet.getNString("City_name");
            String country = resultSet.getNString("Country");

            ArrayList<Object> cities = new ArrayList<>();
            cities.add(cityID);
            cities.add(cityName);
            cities.add(country);

            CitiesInfo.add(cities);
        }
        System.out.println(CitiesInfo);
        connection.close();
        statement.close();

    }
}

