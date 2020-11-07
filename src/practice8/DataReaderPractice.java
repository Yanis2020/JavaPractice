package practice8;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataReaderPractice {
    public static void main(String[] args) throws IOException {
        String tmpContainer;
        String finalText = "";

        FileReader fileReader = new FileReader("src/practice8/data/data.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while ((tmpContainer = bufferedReader.readLine()) != null) {
            finalText = finalText + " \n" + tmpContainer;

        }
        System.out.println(finalText);
    }
}
