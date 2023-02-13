package mall.service.impl;

import mall.service.MallService;
import order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xuanyu peng
 * @description:
 * @date 2023/2/13 22:27
 */
@Service
public class MallServiceImlp implements MallService {
    @Autowired
    OrderService orderService;

    @Override
    public String createOrderFromMall(String userId) {
        return orderService.createOrder(userId);
    }
}
