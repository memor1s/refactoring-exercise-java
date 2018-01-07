package com.greatersum.rental.movie;

import java.math.BigDecimal;

public abstract class Movie {
    private final String title;
    private final MovieType type;

    public Movie(String title, MovieType type) {

        this.title = title;
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public abstract BigDecimal getMoviePrice(int days);

    public int getRentalPoints(int days) {
        return 1;
    }
}
