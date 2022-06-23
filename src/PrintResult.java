public class PrintResult {
    static void print(int count, String name) {
        if (count != 0) {
            System.out.println(" Слово с корнем \"" + Main.wordToSearch + "\" встречается в тексте " + count + " раз" +
                    " согласно подсчета методом " + name);
        } else {
            System.out.println(" Слово с корнем \"" + Main.wordToSearch + "\" отсутствует в тексте " +
                    " согласно подсчета методом " + name);
        }
    }
}
