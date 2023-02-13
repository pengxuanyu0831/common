import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author xuanyu peng
 * @description:
 * @date 2023/2/13 22:57
 */
@SpringBootApplication
@EnableFeignClients(basePackages = "")
public class OrderSpringApplication {
}
