package training;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FileReaderPrac {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream("src/Training/userPrac.properties");
        properties.load(inputStream);


        String username = properties.getProperty("username");
        String password = properties.getProperty("password");
        String urlA = properties.getProperty("url");

        System.out.println("The username is " + username + " and the password is " + password);
        System.out.println("The url is " + urlA);

    }
}
