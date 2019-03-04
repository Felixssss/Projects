package com.gem.film_management.pojo;

public class Order {
    private int id;
    private int fid;
    private int uid;
    private String film_name;
    private double film_price;
    private String film_start;
    private String film_end;
    private String order_time;
    private int film_number;
    private String user_name;

    public Order(){
        super();
    }

    public Order(int id, int fid, int uid, String film_name, double film_price, String film_start, String film_end, String order_time, int film_number, String user_name) {
        this.id = id;
        this.fid = fid;
        this.uid = uid;
        this.film_name = film_name;
        this.film_price = film_price;
        this.film_start = film_start;
        this.film_end = film_end;
        this.order_time = order_time;
        this.film_number = film_number;
        this.user_name = user_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getFilm_name() {
        return film_name;
    }

    public void setFilm_name(String film_name) {
        this.film_name = film_name;
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

    public String getOrder_time() {
        return order_time;
    }

    public void setOrder_time(String order_time) {
        this.order_time = order_time;
    }

    public int getFilm_number() {
        return film_number;
    }

    public void setFilm_number(int film_number) {
        this.film_number = film_number;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", fid=" + fid +
                ", uid=" + uid +
                ", film_name='" + film_name + '\'' +
                ", film_price=" + film_price +
                ", film_start='" + film_start + '\'' +
                ", film_end='" + film_end + '\'' +
                ", order_time='" + order_time + '\'' +
                ", film_number=" + film_number +
                ", user_name='" + user_name + '\'' +
                '}';
    }
}
