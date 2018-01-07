package com.greatersum.rental.movie;

public interface MovieFactory {
    Movie getMovie(String title, MovieType type);
}
