package com.qf.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by 54110 on 2019/12/11.
 */
@FeignClient(value = "CAR-PAY",fallback = MessageServiceFallback.class)
public interface PayClient {

    @GetMapping("/pay")
    public String pay();
}
