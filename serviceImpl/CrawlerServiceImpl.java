package serviceImpl;

import service.CrawlerService;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;

import java.io.IOException;

public class CrawlerServiceImpl implements CrawlerService {
    @Override
    public void findNamesFromWeb() throws IOException {
        Document doc = Jsoup.connect("웹데이터를 가져올 주소").get();
    }

}