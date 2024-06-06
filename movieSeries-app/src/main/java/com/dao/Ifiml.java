package com.dao;
import com.model.film;
import java.util.List;

public interface Ifiml {

    void saveFilm(film f);
    List<film> getAllFilms();
    film getFilmById(int id);
    void updateFilm(film f);
    void deleteFilm(int id);
}

