package com.gem.dao.impl;

import com.gem.dao.BaseDAO;
import com.gem.dao.FruitDAO;
import com.gem.dao.FruitParseRs;
import com.gem.pojo.Fruit;

import java.util.List;

public class FruitDAOImpl extends BaseDAO<Fruit> implements FruitDAO{
    private FruitParseRs parse = new FruitParseRs();

    public List<Fruit> getAllFruit() {
        String sql="select * from fruit";
        return super.executeQuery(parse, sql);
    }

    public boolean addFruit(Fruit fruit) {
        String sql="insert into fruit values (0,?,?,?,?)";
        return  super.executeUpdate(sql, fruit.getFruitname(),fruit.getPrice(),fruit.getAmount(),fruit.getComment());
    }

    public boolean delFruit(Fruit fruit){
        String sql="delete from fruit where fruitname=?";
        return super.executeUpdate(sql, fruit.getFruitname());
    }

    public boolean upFruit(Fruit newFruit) {
        String sql="update fruit set fruitname=?,price=?,amount=?,comment=? where fruitname=?";
        return super.executeUpdate(sql, newFruit.getFruitname(),newFruit.getPrice(),newFruit.getAmount(),newFruit.getComment(),newFruit.getFruitname());

    }

    public List<Fruit> findFruitByName(String fruitname) {
        String sql="select * from fruit where fruitname=?";
        return super.executeQuery(parse, sql, fruitname);
    }

    public Fruit findFruitName(String fruitname) {
        String sql="select * from fruit where fruitname=?";
        return super.load(parse, sql, fruitname);
    }

    public List<Fruit> ascPrice() {
        String sql="select * from fruit order by price asc";
        return  super.executeQuery(parse, sql);
    }
    public List<Fruit> desPrice() {
        String sql="select * from fruit order by price desc";
        return  super.executeQuery(parse, sql);
    }




}