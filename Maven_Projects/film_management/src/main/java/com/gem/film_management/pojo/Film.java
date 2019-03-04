package com.gem.film_management.pojo;

public class Film {
    private int id;
    private String film_name;
    private String film_pic;
    private String film_introduce;
    private String film_type;
    private double film_price;
    private String film_start;
    private String film_end;

    public Film(){
        super();
    }

    public Film(int id, String film_name, String film_pic, String film_introduce, String film_type, double film_price, String film_start, String film_end) {
        this.id = id;
        this.film_name = film_name;
        this.film_pic = film_pic;
        this.film_introduce = film_introduce;
        this.film_type = film_type;
        this.film_price = film_price;
        this.film_start = film_start;
        this.film_end = film_end;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilm_name() {
        return film_name;
    }

    public void setFilm_name(String film_name) {
        this.film_name = film_name;
    }

    public String getFilm_pic() {
        return film_pic;
    }

    public void setFilm_pic(String film_pic) {
        this.film_pic = film_pic;
    }

    public String getFilm_introduce() {
        return film_introduce;
    }

    public void setFilm_introduce(String film_introduce) {
        this.film_introduce = film_introduce;
    }

    public String getFilm_type() {
        return film_type;
    }

    public void setFilm_type(String film_type) {
        this.film_type = film_type;
    }

    public double getFilm_price() {
        return film_price;
    }

    public void setFilm_price(double film_price) {
        this.film_price = film_price;
    }

    public String getFilm_start() {
        return film_start;
    }

    public void setFilm_start(String film_start) {
        this.film_start = film_start;
    }

    public String getFilm_end() {
        return film_end;
    }

    public void setFilm_end(String film_end) {
        this.film_end = film_end;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", film_name='" + film_name + '\'' +
                ", film_pic='" + film_pic + '\'' +
                ", film_introduce='" + film_introduce + '\'' +
                ", film_type='" + film_type + '\'' +
                ", film_price=" + film_price +
                ", film_start='" + film_start + '\'' +
                ", film_end='" + film_end + '\'' +
                '}';
    }
}
