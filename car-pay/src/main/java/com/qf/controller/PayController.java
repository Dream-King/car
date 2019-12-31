package com.qf.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 54110 on 2019/12/11.
 */
@RestController
public class PayController {

    @RequestMapping("/pay")
    @HystrixCommand(fallbackMethod = "errorMessage")
    public String pay(){
        //执行自己的业务逻辑去进行付款
        int i =1/0;
        return "success";
    }


    @RequestMapping("/payFirst")
    public String payFirst(){
        //执行自己的业务逻辑去进行付款
        int i =1/0;
        return "success";
    }

    public String errorMessage(){
        return "您当前调用的方法暂时不可用，请稍后重试";
    }
}
