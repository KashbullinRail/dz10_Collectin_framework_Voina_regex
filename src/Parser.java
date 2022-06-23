import java.io.*;
import java.util.ArrayList;

public class Parser {
    ArrayList<String> parse(File file) {
        ArrayList<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
                Main.lineToGet = line.split(" ");
                SearchAndCountBufferedReader.searchAndCountBufferedReader();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
