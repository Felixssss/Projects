package com.gem.demo.pojo;

public class Book {
    private int id;
    private String bname;
    private double price;
    private String author;
    private String remark;

    public Book(){
        super();
    }

    public Book(int id, String bname, double price, String author, String remark) {
        this.id = id;
        this.bname = bname;
        this.price = price;
        this.author = author;
        this.remark = remark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bname='" + bname + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
