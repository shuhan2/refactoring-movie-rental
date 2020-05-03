package cn.xpbootcamp.refactor;

public class History extends Rental {

  History(Movie movie, int daysRented) {
    super(movie, daysRented);
  }

  @Override
  double getAmount() {
    double amount =2;
    if (getDaysRented() > 2)
      amount += (getDaysRented() - 2) * 1.5;
    return amount;
  }
}
