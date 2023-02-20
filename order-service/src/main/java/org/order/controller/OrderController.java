package org.order.controller;

import org.order.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xuanyu peng
 * @description:
 * @date 2023/2/19 18:56
 */
@RestController
@RequestMapping("/order/v1")
public class OrderController {
    @Resource
    private OrderService orderService;

    @GetMapping("/createOrder")
    public String createOrder(@RequestParam("userId") String userId) {
        return orderService.createOrder(userId);
    }
}
