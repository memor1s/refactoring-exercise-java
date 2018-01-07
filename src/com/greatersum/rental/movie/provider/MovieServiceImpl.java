package com.greatersum.rental.movie.provider;

import com.greatersum.rental.movie.Movie;

import java.util.Map;
import java.util.Optional;

public class MovieServiceImpl implements MovieService {
    //todo: Injection...
    private static MovieServiceImpl INSTANCE = new MovieServiceImpl(new SimpleMoviesProvider());

    private final Map<String, Movie> movies;

    public MovieServiceImpl(MoviesProvider provider) {
        this.movies = provider.getMovies();
    }

    @Override
    public Optional<Movie> getMovieById(String movieId) {
        return Optional.ofNullable(movies.get(movieId));
    }

    public static MovieService getInstance() {
        return INSTANCE;
    }
}
