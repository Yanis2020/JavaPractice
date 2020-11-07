package practice7.lib;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FileUtils {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream("src/practice7/lib/test.properties");
        properties.load(inputStream);

        String idName = properties.getProperty("id");
        String name = properties.getProperty("name");
        String city = properties.getProperty("city");
        System.out.println(idName + " " + name + " " + city);

    }
}
