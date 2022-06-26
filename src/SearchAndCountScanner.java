import java.io.*;
import java.util.Scanner;

public class SearchAndCountScanner {
    public static int countSc;

    public static void searchAndCountScanner() throws FileNotFoundException {
        Scanner sc = new Scanner(new FileInputStream(Main.pathText));
        Main.lineToGet = null;
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            Main.lineToGet = line.split(" ");
            for (String str : Main.lineToGet) {
                line = line.toLowerCase();
                String wordToSearch = Main.wordToSearch.toLowerCase();
                if (str.matches(wordToSearch)) {
                    countSc++;
                }
            }
        }
    }
}
