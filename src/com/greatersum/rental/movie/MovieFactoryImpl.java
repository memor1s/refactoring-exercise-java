package com.greatersum.rental.movie;

import com.greatersum.rental.movie.domain.ChildrenMovie;
import com.greatersum.rental.movie.domain.NewMovie;
import com.greatersum.rental.movie.domain.RegularMovie;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class MovieFactoryImpl implements MovieFactory {

    private static MovieFactoryImpl INSTANCE = new MovieFactoryImpl();

    private static Map<MovieType, Function<String, Movie>> movieTypeToConstructors = new HashMap<>();

    static {
        movieTypeToConstructors.put(MovieType.NEW, NewMovie::new);
        movieTypeToConstructors.put(MovieType.REGULAR, RegularMovie::new);
        movieTypeToConstructors.put(MovieType.CHILDREN, ChildrenMovie::new);
    }

    public static MovieFactory getInstance() {
        return INSTANCE;
    }

    @Override
    public Movie getMovie(String title, MovieType type) {
        return movieTypeToConstructors.get(type).apply(title);
    }
}
