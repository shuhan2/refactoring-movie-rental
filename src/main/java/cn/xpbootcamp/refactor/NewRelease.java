package cn.xpbootcamp.refactor;

public class NewRelease extends Rental {

  NewRelease(Movie movie, int daysRented) {
    super(movie, daysRented);
  }

  @Override
  double getAmount() {
    return getDaysRented() * 3;
  }
}
