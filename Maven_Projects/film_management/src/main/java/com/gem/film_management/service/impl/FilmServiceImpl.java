package com.gem.film_management.service.impl;

import com.gem.film_management.mapper.FilmMapper;
import com.gem.film_management.pojo.Film;
import com.gem.film_management.service.FilmService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class FilmServiceImpl implements FilmService {

    @Resource
    private FilmMapper filmMapper;
    @Override
    public List<Film> show() {
        return filmMapper.getAllFilm();
    }

    @Override
    public Film getFilm(int id) {
        return filmMapper.getFilmById(id);
    }

    @Override
    public void delFilm(int id) {
        filmMapper.delFilm(id);
    }

    @Override
    public void upFilm(Film film) {
        filmMapper.upFilm(film);
    }

    @Override
    public void addFilm(Film film) {
        filmMapper.addFilm(film);
    }

    @Override
    public PageInfo<Film> getAll(int curPage) {
        //总数
        int count = filmMapper.filmTotal();
        //分页：curpage当前页     PageUtil.pageSize
        PageHelper.startPage(curPage, 14);
        List<Film> films = filmMapper.getAllFilm();
        PageInfo<Film> pageInfo = new PageInfo<Film>(films);
        pageInfo.setPageNum(curPage);
        pageInfo.setPageSize(14);
        pageInfo.setTotal(count);
        return pageInfo;
    }


    @Override
    public PageInfo<Film> searchAll(int curPage,String film_name) {
        //总数
        int count = filmMapper.searchTotal(film_name);
        //分页：curpage当前页     PageUtil.pageSize
        PageHelper.startPage(curPage, 14);
        List<Film> search = filmMapper.searchFilm(film_name);
        PageInfo<Film> pageInfo = new PageInfo<Film>(search);
        pageInfo.setPageNum(curPage);
        pageInfo.setPageSize(14);
        pageInfo.setTotal(count);
        return pageInfo;
    }

    @Override
    public List<Film> searchType(String film_type) {
        //总数

        return filmMapper.searchType(film_type);
    }
}
