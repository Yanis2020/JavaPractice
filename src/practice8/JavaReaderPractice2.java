package practice8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JavaReaderPractice2 {
    public static void main(String[] args) throws IOException {
        String tmpCotainer;
        String finalText = "";

        FileReader fileReader = new FileReader("src/practice8/data/Data2.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while ((tmpCotainer = bufferedReader.readLine()) != null) {
            finalText = finalText + "\n" + tmpCotainer;


        }
        System.out.println(finalText.trim());
    }
}
