package com.gem.film_management.service;

import com.gem.film_management.pojo.Order;
import java.util.List;

public interface OrderService {
    List<Order> getAllOrder();
    Order getOrder(String order_time);
    void delOrder(Integer id);
    void addOrder(Order order);
    List<Order> getOrderByUid(Integer uid);

}
