package com.greatersum.rental.movie.provider;

import com.greatersum.rental.movie.Movie;
import com.greatersum.rental.movie.MovieFactory;
import com.greatersum.rental.movie.MovieFactoryImpl;
import com.greatersum.rental.movie.MovieType;

import java.util.HashMap;
import java.util.Map;

public class SimpleMoviesProvider implements MoviesProvider {

    @Override
    public Map<String, Movie> getMovies() {
        HashMap<String, Movie> movies = new HashMap<>();
        movies.put("F001", createMovie("Ran", MovieType.REGULAR));
        movies.put("F002", createMovie("Trois Couleurs: Bleu", MovieType.REGULAR));
        movies.put("F003", createMovie("Cars 2", MovieType.CHILDREN));
        movies.put("F004", createMovie("Latest Hit Release", MovieType.NEW));
        return movies;
    }


    protected Movie createMovie(String title, MovieType type) {
        return getFactory().getMovie(title, type);
    }

    protected MovieFactory getFactory() {
        return MovieFactoryImpl.getInstance();
    }


}
