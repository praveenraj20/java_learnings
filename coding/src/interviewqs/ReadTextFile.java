package interviewqs;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadTextFile {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/apple/Downloads/Requests.txt";
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        secMethod(filePath);
    }

    private static void secMethod(String filePath) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filePath));
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
