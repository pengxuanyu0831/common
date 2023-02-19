package org.order.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xuanyu peng
 * @description:
 * @date 2023/2/13 21:44
 */
@FeignClient(value = "order-service")
public interface OrderService {
    @RequestMapping(value = "/order-service/order/v1/createOrder",method = RequestMethod.GET)
    String createOrder(@RequestParam("userId") String userId);
}
