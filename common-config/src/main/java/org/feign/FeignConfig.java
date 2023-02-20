package org.feign;


import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xuanyu peng
 * @description:
 * @date 2023/2/20 22:06
 */
//@Configuration
public class FeignConfig {

//    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
