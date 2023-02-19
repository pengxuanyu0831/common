package org.mall.controller;

import org.mall.service.MallService;
import org.order.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xuanyu peng
 * @description:
 * @date 2023/2/13 21:50
 */
@RestController
@RequestMapping("/mall/v1")
public class MallController {
    @Resource
    private OrderService orderService;

    @Resource
    private MallService mallService;


    @GetMapping("/createOrderFromMall")
    public String createOrderFromMall() {
        return orderService.createOrder("1");
    }


}
