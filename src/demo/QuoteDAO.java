package demo;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuoteDAO {

    private static List<Quote> quotes;
    private Random random = new Random();

    public QuoteDAO() {
        if (quotes == null) {
            quotes = new ArrayList<Quote>();
            for (int i = 0; i < 10; i++) {
                Quote q = new Quote("Quotable quote #" + i, "Author " + i, "Anon");
                quotes.add(q);
            }
        }
    }


    public void addQuote(Quote q) {
        quotes.add(q);
    }

    public Quote getQuote() {
        return quotes.get(random.nextInt(quotes.size()));
    }
}
