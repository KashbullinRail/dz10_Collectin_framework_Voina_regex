public class SearchAndCountBufferedReader {
    public static int countBR;

    public static void searchAndCountBufferedReader() {
        for (String str : Main.lineToGet) {
            str = str.toLowerCase();
            String wordToSearch = Main.wordToSearch.toLowerCase();
            if (str.contains(wordToSearch)) {
                countBR++;
            }
        }
    }
}
