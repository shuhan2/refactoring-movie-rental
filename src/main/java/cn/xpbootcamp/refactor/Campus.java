package cn.xpbootcamp.refactor;

public class Campus extends Rental {

  Campus(Movie movie, int daysRented) {
    super(movie, daysRented);
  }

  @Override
  double getAmount() {
    double amount = 1.5;
    if (getDaysRented() > 3)
      amount += (getDaysRented() - 3) * 1.5;
    return amount;
  }
}
