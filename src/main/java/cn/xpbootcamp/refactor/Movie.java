package cn.xpbootcamp.refactor;

public class Movie {

    static final int CAMPUS = 2;
    static final int HISTORY = 0;
    static final int NEW_RELEASE = 1;

    private String title;
    private PriceCode priceCode;

    Movie(String title, PriceCode priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    PriceCode getPriceCode() {
        return priceCode;
    }

    String getTitle() {
        return title;
    }
}
