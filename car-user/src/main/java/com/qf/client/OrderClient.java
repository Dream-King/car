package com.qf.client;

import com.qf.domain.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * Created by 54110 on 2019/12/11.
 */
@FeignClient(serviceId = "CAR-ORDER")
public interface OrderClient {
    //http://car-order/getorderList/userid
    @GetMapping("/getOrderList/{userid}")
    public String getOrderList(@PathVariable("userid")Integer userid);
    @PostMapping("/save")
    public String save(@RequestBody Order order);

    @PostMapping("/updateOrder")
    public String updateOrder(@RequestBody Order order);
    @GetMapping("/deleteOrder/{id}")
    String deleteById(@PathVariable("id")Integer id);
}
