package mall.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author xuanyu peng
 * @description:
 * @date 2023/2/13 22:26
 */
@FeignClient(name = "order-service")
public interface MallService {

    @GetMapping("/createOrder")
    String createOrderFromMall(String userId);
}


