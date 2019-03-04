package com.gem.dao.mapper;

import com.gem.pojo.Fruit;

import java.util.List;

public interface FruitMapper {

    public List<Fruit> getAllFruit();
    public boolean addFruit(Fruit fruit);
    public int delFruit(String fruitname);
    public boolean upFruit(Fruit fruit);
   // public List<Fruit> findFruitByName(String fruitname);
    public Fruit findFruitName(String fruitname);
    public List<Fruit> ascPrice();
    public List<Fruit> descPrice();
    public List<Fruit> sortPrice(Fruit fruit);
}
