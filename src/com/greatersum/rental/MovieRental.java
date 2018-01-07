package com.greatersum.rental;

import com.greatersum.rental.movie.Movie;
import com.greatersum.rental.movie.provider.MovieService;
import com.greatersum.rental.movie.provider.MovieServiceImpl;

import java.math.BigDecimal;

public class MovieRental {
    private final String movieId;
    private final int days;
    private Movie movie = null;

    public MovieRental(String movieId, int days) {
        this.movieId = movieId;
        this.days = days;
    }

    public String getMovieId() {
        return movieId;
    }

    public int getDays() {
        return days;
    }

    public Movie getMovie() {
        if (movie == null) {
            movie = getMovieService()
                    .getMovieById(movieId)
                    .orElseThrow(() -> new IllegalStateException("Movie not found"));
        }
        return movie;
    }

    public String getMovieTitle() {
        return getMovie().getTitle();
    }

    public BigDecimal getMoviePrice() {
        return getMovie().getMoviePrice(days);
    }

    public int getFrequentRentalPoints() {
        return getMovie().getRentalPoints(days);
    }

    MovieService getMovieService() {
        return MovieServiceImpl.getInstance();
    }

}
