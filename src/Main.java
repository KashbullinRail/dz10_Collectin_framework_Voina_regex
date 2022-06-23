import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    public static String[] lineToGet = null;
    public static String wordToSearch = "страдан";
    public static String pathText = "voina12.txt";

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File(pathText);
        Parser parser = new Parser();
        ArrayList<String> lines = parser.parse(file);
        for (String line : lines) {
            System.out.println(line);
        }

        System.out.println();
        PrintResult.print(SearchAndCountBufferedReader.countBR, "BufferedReader");
        SearchAndCountScanner.searchAndCountScanner();
        PrintResult.print(SearchAndCountScanner.countSc, "Scanner");
        System.out.println();
        MultiplyTable.multiplyTable();
    }


}
