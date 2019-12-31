package com.qf.controller;

import com.qf.client.PayClient;
import com.qf.domain.Order;
import com.qf.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by 54110 on 2019/12/11.
 */
@RestController
public class OrderController {

    @Autowired
    PayClient payClient;

    @Autowired
    private OrderService orderService;

    @RequestMapping("/getOrderList/{userid}")
    public List<Order> getOrderList(@PathVariable("userid")Integer userid){
      return   orderService.findALL(userid);
    }

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public Order save(@RequestBody Order order){
        return   orderService.save(order);
    }

    @RequestMapping(value = "/updateOrder",method = RequestMethod.POST)
    public Order updateOrder(@RequestBody Order order){

        return  orderService.save(order);
    }

    @RequestMapping(value = "/deleteOrder/{id}")
    public String deleteOrder(@PathVariable("id")Integer id){
        String statu = orderService.deleteById(id);
        return statu;
    }

    @RequestMapping("/pay")
    public String pay(){
        //调用car-pay服务完成付款
        return payClient.pay();
    }
}
