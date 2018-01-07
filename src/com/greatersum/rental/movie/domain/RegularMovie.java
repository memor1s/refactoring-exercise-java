package com.greatersum.rental.movie.domain;

import com.greatersum.rental.movie.Movie;
import com.greatersum.rental.movie.MovieType;

import java.math.BigDecimal;

public class RegularMovie extends Movie {
    public RegularMovie(String title) {
        super(title, MovieType.REGULAR);
    }

    @Override
    public BigDecimal getMoviePrice(int days) {
        BigDecimal thisAmount = BigDecimal.valueOf(2);
        if (days > 2) {
            thisAmount = BigDecimal.valueOf((days - 2) * 1.5).add(thisAmount);
        }
        return thisAmount;
    }
}
