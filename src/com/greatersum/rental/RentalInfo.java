package com.greatersum.rental;

import java.math.BigDecimal;

public class RentalInfo {

    public String statement(Customer customer) {
        StringBuilder result = new StringBuilder(getStatementHeader(customer));
        for (MovieRental r : customer.getRentals()) {
            result.append("\t").append(r.getMovieTitle()).append("\t").append(r.getMoviePrice()).append("\n");
        }
        result.append(getStatementFooter(customer.getTotalAmount(), customer.getSummaryRenterPoints()));

        return result.toString();
    }

    protected String getStatementHeader(Customer customer) {
        return "Rental Record for " + customer.getName() + "\n";
    }

    protected String getStatementFooter(BigDecimal totalAmount, int frequentRenterPoints) {
        String result = "Amount owed is " + totalAmount + "\n";
        result += "You earned " + frequentRenterPoints + " frequent renter points\n";
        return result;
    }

}
