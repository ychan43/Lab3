import javafx.scene.web.WebEngine;

public class Main {
    public static void main(String[] args) {
        System.out.println(WebScrapper.urlToString("http://erdani.com/tdpl/hamlet.txt"));
        String doc = WebScrapper.urlToString("http://erdani.com/tdpl/hamlet.txt");
        String[] words = doc.split(" ");
        int counter = 0;
        for (int c = 0; c < words.length; c++) {
            if (words[c] != " ") {
                counter++;
            }
        }
        System.out.print(counter);
    }
}
