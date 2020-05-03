package cn.xpbootcamp.refactor;

import java.util.Enumeration;
import java.util.Vector;

import static cn.xpbootcamp.refactor.PriceCode.NEW_RELEASE;

public class Customer {

  private String name;
  private Vector<Rental> rentals = new Vector<>();

  Customer(String name) {
    this.name = name;
  }

  void addRental(Rental rental) {
    rentals.addElement(rental);
  }

  private String getName() {
    return name;
  }

  String statement() {
    double totalAmount = 0d;
    int frequentRenterPoints = 0;
    Enumeration<Rental> rentals = this.rentals.elements();
    StringBuilder result = new StringBuilder("Rental Record for " + getName() + "：\n");
    while (rentals.hasMoreElements()) {
      Rental rental = rentals.nextElement();
      //show figures for this rental
      //determine amounts for rental line
      double thisAmount = rental.getAmount();
      //add frequent renter points
      frequentRenterPoints++;
      if ((rental.getMovie().getPriceCode() == NEW_RELEASE) && rental.getDaysRented() > 1) {
        frequentRenterPoints++;
      }

      //show figures for this rental
      result.append("\t")
          .append(rental.getMovie().getTitle())
          .append("\t")
          .append(thisAmount).append("\n");
      totalAmount += thisAmount;
    }
    //add footer lines
    result.append("Amount owed is ").append(totalAmount).append("\n");
    result.append("You earned ").append(frequentRenterPoints).append(" frequent renter points");
    return result.toString();
  }

}
