package com.greatersum.rental.movie.domain;

import com.greatersum.rental.movie.Movie;
import com.greatersum.rental.movie.MovieType;

import java.math.BigDecimal;

public class ChildrenMovie extends Movie {
    public ChildrenMovie(String title) {
        super(title, MovieType.CHILDREN);
    }

    @Override
    public BigDecimal getMoviePrice(int days) {
        BigDecimal thisAmount = BigDecimal.valueOf(1.5);
        if (days > 3) {
            thisAmount = BigDecimal.valueOf((days - 3) * 1.5).add(thisAmount);
        }
        return thisAmount;
    }
}
