package org.mall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author xuanyu peng
 * @description:
 * @date 2023/2/13 21:55
 */
@SpringBootApplication
@EnableFeignClients(basePackages = {"org.order.service"})
public class MallSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(MallSpringApplication.class, args);
    }
}
