package com.greatersum.rental.movie.provider;

import com.greatersum.rental.movie.Movie;

import java.util.Optional;

public interface MovieService {
    Optional<Movie> getMovieById(String movieId);
}
