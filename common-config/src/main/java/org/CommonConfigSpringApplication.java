package org;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

/**
 * @author xuanyu peng
 * @description:
 * @date 2023/2/20 22:09
 */
@SpringBootApplication
@ComponentScan()
public class CommonConfigSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommonConfigSpringApplication.class, args);
    }
}
