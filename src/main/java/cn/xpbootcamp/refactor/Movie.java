package cn.xpbootcamp.refactor;

public class Movie {

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
