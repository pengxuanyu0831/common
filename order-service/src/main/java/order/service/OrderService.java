package order.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author xuanyu peng
 * @description:
 * @date 2023/2/13 21:44
 */
@FeignClient(value = "order-service",path = "/order/v2")
public interface OrderService {
    @RequestMapping("/createOrder")
    String createOrder(@RequestParam("userId") String userId);
}
