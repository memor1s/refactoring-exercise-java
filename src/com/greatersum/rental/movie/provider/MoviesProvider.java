package com.greatersum.rental.movie.provider;

import com.greatersum.rental.movie.Movie;

import java.util.Map;

public interface MoviesProvider {
    Map<String, Movie> getMovies();
}
