package com.qf.service.impl;

import com.qf.domain.Order;
import com.qf.repository.OrderRepository;
import com.qf.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 54110 on 2019/12/11.
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    OrderRepository orderRepository;


    @Override
    public List<Order> findALL(Integer userid) {
        return orderRepository.findByUserId(userid);
    }

    @Override
    public Order save(Order order) {
        return orderRepository.saveAndFlush(order);
    }

    @Override
    public String deleteById(Integer id) {

        try {
            orderRepository.deleteById(id);
            return "success";
        }catch (Exception e){
            return "fail";
        }

    }
}
