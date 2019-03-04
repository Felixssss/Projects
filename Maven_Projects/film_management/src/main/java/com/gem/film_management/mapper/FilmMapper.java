package com.gem.film_management.mapper;

import com.gem.film_management.pojo.Film;

import java.util.List;

public interface FilmMapper {
    List<Film> getAllFilm();
    Film getFilmById(int id);
    void delFilm(int id);
    void upFilm(Film film);
    void addFilm(Film film);
    int filmTotal();
    int searchTotal(String film_name);
    List<Film> searchFilm(String film_name);
    List<Film> searchType(String film_type);
}
