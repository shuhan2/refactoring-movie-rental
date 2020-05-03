package cn.xpbootcamp.refactor;

public class Rental {

    private Movie movie;
    private int daysRented;

    Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    Movie getMovie() {
        return movie;
    }

    int getDaysRented() {
        return daysRented;
    }

    double getAmount(){
        double amount ;
        if (movie.getPriceCode() == PriceCode.CAMPUS) {
            amount = 1.5;
            if (getDaysRented() > 3)
                amount += (getDaysRented() - 3) * 1.5;
            return amount;
        }
        if(movie.getPriceCode() == PriceCode.HISTORY) {
            amount =2;
            if (getDaysRented() > 2)
                amount += (getDaysRented() - 2) * 1.5;
            return amount;
        }
        return getDaysRented() * 3;
    };

}
