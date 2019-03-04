package com.gem.news.user.pojo;

public class News {
    private int id;
    private String headline;
    private String detail;
    private String reporter;

    public News(){
        super();
    }
    public News(int id, String headline, String detail, String reporter){
        this.id = id;
        this.headline = headline;
        this.detail = detail;
        this.reporter = reporter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    @Override
    public String toString() {
        return "News{" +
                "id=" + id +
                ", headline='" + headline + '\'' +
                ", detail='" + detail + '\'' +
                ", reporter='" + reporter + '\'' +
                '}';
    }
}
