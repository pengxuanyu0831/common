package org.order.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * @author xuanyu peng
 * @description:
 * @date 2023/2/13 21:44
 */
@FeignClient(value = "order-service")
public interface OrderService {

    @GetMapping("/order/v1/createOrder")
    public String createOrder(@RequestParam("userId") String userId);
}
