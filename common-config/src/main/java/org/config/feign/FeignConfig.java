package org.config.feign;


import feign.Logger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xuanyu peng
 * @description:
 * @date 2023/2/20 22:06
 */
@Configuration
@Slf4j
public class FeignConfig {

    @Bean
    Logger.Level feignLoggerLevel() {
        log.info(">>>>>>>>>>>>>加载 Feign 日志配置完成<<<<<<<<<<<<<");
        return Logger.Level.FULL;
    }
}
