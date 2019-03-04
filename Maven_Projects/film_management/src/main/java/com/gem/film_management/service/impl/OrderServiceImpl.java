package com.gem.film_management.service.impl;


import com.gem.film_management.mapper.OrderMapper;
import com.gem.film_management.pojo.Order;
import com.gem.film_management.service.OrderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class OrderServiceImpl implements OrderService{

    @Resource
    private OrderMapper orderMapper;

    @Override
    public List<Order> getAllOrder() {
        return orderMapper.getAllOrder();
    }

    @Override
    public Order getOrder(String order_time) {
        return orderMapper.getOrderByTime(order_time);
    }

    @Override
    public void delOrder(Integer id) {
        orderMapper.delOrder(id);

    }

    @Override
    public void addOrder(Order order) {
        orderMapper.addOrder(order);

    }

    @Override
    public List<Order> getOrderByUid(Integer uid) {
        return orderMapper.getOrderByUid(uid);
    }


}
