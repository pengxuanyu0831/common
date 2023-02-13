import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author xuanyu peng
 * @description:
 * @date 2023/2/13 22:57
 */
@SpringBootApplication
public class OrderSpringApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderSpringApplication.class, args);
    }
}
