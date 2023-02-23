package org.mall.controller;

import lombok.extern.slf4j.Slf4j;
import org.mall.service.MallService;
import org.order.service.OrderService;
import org.response.CommonResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xuanyu peng
 * @description:
 * @date 2023/2/13 21:50
 */
@RestController
//@RequestMapping("/mall/v1")
@Slf4j
public class MallController {
    @Resource
    private OrderService orderService;

//    @Resource
//    private MallService mallService;


    @GetMapping("/order/v1/createOrder")
    public CommonResponse<String> createOrderFromMall(@RequestParam("userId") String userId) {
        log.info("请求--->>>{}",userId);
        return new CommonResponse(orderService.createOrder(userId));
    }


}
