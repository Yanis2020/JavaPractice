package practice8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataReaderPractice3 {
    public static void main(String[] args) throws IOException {
        String tmp;
        String finalText = "";

        FileReader fileReader = new FileReader("src/practice8/data/Data2.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while ((tmp = bufferedReader.readLine()) != null) {
            finalText = finalText + "\n" + tmp;

        }
        System.out.println(finalText.trim());
    }
}
