package com.qf.client;

import org.springframework.stereotype.Component;

/**
 * Created by 54110 on 2019/12/11.
 */
@Component
public class MessageServiceFallback implements  PayClient{
    @Override
    public String pay() {
        return "当前网络波动，car-pay被降级了";
    }
}
