package com.qf.controller;

import com.qf.domain.Order;
import com.qf.client.OrderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by 54110 on 2019/12/11.
 */
@RestController
public class UserController {

    @Autowired
    private OrderClient orderClient;

    @RequestMapping("/getuserorders/{id}")
    public String getUserOrders(@PathVariable("id")Integer id){
        String orderList = orderClient.getOrderList(id);
        return orderList;
    }

    @RequestMapping(value = "/saveOrder",method = RequestMethod.POST)
    public String getUserOrders(@RequestBody Order order){
        String orderList = orderClient.save(order);
        return orderList;
    }

    @RequestMapping(value = "/updateOrder",method = RequestMethod.POST)
    public String updateOrder(@RequestBody Order order){
        String orderList = orderClient.save(order);
        return orderList;
    }

    @RequestMapping(value = "/deleteOrder/{id}")
    public String deleteOrder(@PathVariable("id")Integer id){
        String statu = orderClient.deleteById(id);
        return statu;
    }
}
