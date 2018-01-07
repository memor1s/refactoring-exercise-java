package com.greatersum.rental.movie.domain;

import com.greatersum.rental.movie.Movie;
import com.greatersum.rental.movie.MovieType;

import java.math.BigDecimal;

public class NewMovie extends Movie {
    public NewMovie(String title) {
        super(title, MovieType.NEW);
    }

    @Override
    public BigDecimal getMoviePrice(int days) {
        return BigDecimal.valueOf(days * 3);
    }

    @Override
    public int getRentalPoints(int days) {
        int rentalPoints = super.getRentalPoints(days);
        if (days > 2) {
            rentalPoints++;
        }
        return rentalPoints;
    }
}
