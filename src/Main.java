import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.IOException;

/**
 * Created by yjm on 2017/6/10.
 */
public class Main {
    static public void main(String[]args) throws IOException {
        Document document=Jsoup.connect("https://github.com/login").get();
        Elements element =document.select("input[name=authenticity_token]");
        String s = element.attr("value");
        System.out.print(s);
    }
}
