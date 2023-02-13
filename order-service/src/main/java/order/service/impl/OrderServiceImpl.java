package order.service.impl;

import order.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * @author xuanyu peng
 * @description:
 * @date 2023/2/13 22:25
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Override
    public String createOrder(String userId) {
        return "Create order success!";
    }
}
