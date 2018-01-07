package com.greatersum.rental;

import java.math.BigDecimal;
import java.util.List;

public class Customer {
    private final String name;
    private final List<MovieRental> rentals;

    public Customer(String name, List<MovieRental> rentals) {
        this.name = name;
        this.rentals = rentals;
    }

    public String getName() {
        return name;
    }

    public List<MovieRental> getRentals() {
        return rentals;
    }

    public BigDecimal getTotalAmount() {
        return rentals.stream()
                .map(MovieRental::getMoviePrice)
                .reduce(new BigDecimal(0), BigDecimal::add);
    }

    public int getSummaryRenterPoints() {
        return rentals.stream().mapToInt(MovieRental::getFrequentRentalPoints).sum();
    }
}
