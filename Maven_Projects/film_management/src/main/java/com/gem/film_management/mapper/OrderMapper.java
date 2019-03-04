package com.gem.film_management.mapper;

import com.gem.film_management.pojo.Order;

import java.util.List;

public interface OrderMapper {
    void addOrder(Order order);
    void delOrder(Integer id);
    List<Order> getAllOrder();
    Order getOrderByTime(String order_time);
    List<Order> getOrderByUid(Integer uid);

}
