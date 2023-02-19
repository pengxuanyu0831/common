package org.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author xuanyu peng
 * @description:
 * @date 2023/2/13 22:57
 */
@SpringBootApplication
@EnableDiscoveryClient
//@EnableFeignClients(basePackages = {"org.order.service"})
public class OrderSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderSpringApplication.class, args);
    }
}
