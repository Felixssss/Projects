package com.gem.film_management.pojo;

public class Pic {
    private int code;
    private String url;

    public Pic(int code, String url){
        super();
        this.code = code;
        this.url = url;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Pic{" +
                "code=" + code +
                ", url='" + url + '\'' +
                '}';
    }
}
