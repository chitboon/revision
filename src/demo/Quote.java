package demo;

/**
 * Created by chitboon on 12/3/15.
 */
public class Quote {
    private String quote;
    private String author;
    private String contributor;

    public Quote(String quote, String author, String contributor) {
        this.quote = quote;
        this.author = author;
        this.contributor = contributor;
    }

    public String getContributor() {
        return contributor;
    }

    public void setContributor(String contributor) {
        this.contributor = contributor;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
