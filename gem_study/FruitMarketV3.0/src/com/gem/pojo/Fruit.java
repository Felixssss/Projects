package com.gem.pojo;

public class Fruit {
    public int id;
    public String fruitname;
    public double price;
    public String amount;
    public String comment;

    public Fruit() {
        super();
    }
    public Fruit(int id, String fruitname, double price, String amount, String comment) {
        super();
        this.id = id;
        this.fruitname = fruitname;
        this.price = price;
        this.amount = amount;
        this.comment = comment;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFruitname() {
        return fruitname;
    }
    public void setFruitname(String fruitname) {
        this.fruitname = fruitname;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getAmount() {
        return amount;
    }
    public void setAmount(String amount) {
        this.amount = amount;
    }
    public String getComment() {
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "||" + fruitname + "\t" +  price + "\t" + amount + "\t" + comment;
    }

}
