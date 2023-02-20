package org.mall.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xuanyu peng
 * @description:
 * @date 2023/2/13 22:26
 */
@Component
@FeignClient("order-service")
public interface MallService {

    @GetMapping("/order/v1/createOrder")
    public String createOrder(String userId);
}


