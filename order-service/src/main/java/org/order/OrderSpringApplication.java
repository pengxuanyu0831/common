package org.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author xuanyu peng
 * @description:
 * @date 2023/2/13 22:57
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderSpringApplication.class, args);
    }
}
