package com.gem.film_management.service;

import com.gem.film_management.pojo.Film;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface FilmService {
    List<Film> show();
    Film getFilm(int id);
    void delFilm(int id);
    void upFilm(Film film);
    void addFilm(Film film);
    PageInfo<Film> getAll(int curPage);
    PageInfo<Film> searchAll(int curPage, String film_name);
    List<Film> searchType(String film_type);


}
