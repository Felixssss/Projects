package com.gem.dao;

import com.gem.pojo.Fruit;

import java.util.List;

public interface FruitDAO {

    public List<Fruit> getAllFruit();
    public boolean addFruit(Fruit fruit);
    public boolean delFruit(Fruit fruit);
    public boolean upFruit(Fruit newFruit);
    public List<Fruit> findFruitByName(String fruitname);
    public Fruit findFruitName(String fruitname);
    public List<Fruit> ascPrice();
    public List<Fruit> desPrice();

}
