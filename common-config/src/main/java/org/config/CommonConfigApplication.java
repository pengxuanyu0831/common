package org.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author xuanyu peng
 * @description:
 * @date 2023/2/25 21:31
 */

@SpringBootApplication
//@EnableFeignClients(basePackages = {"org.order"})
@EnableDiscoveryClient
public class CommonConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommonConfigApplication.class, args);
    }
}
