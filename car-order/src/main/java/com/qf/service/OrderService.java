package com.qf.service;

import com.qf.domain.Order;

import java.util.List;

/**
 * Created by 54110 on 2019/12/11.
 */
public interface OrderService {
    List<Order> findALL(Integer userid);

    Order save(Order order);

    String deleteById(Integer id);
}
