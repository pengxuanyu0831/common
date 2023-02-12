import award.strategy.AwardContext;
import award.strategy.AwardParent;
import award.strategy.impl.CarAward;
import award.strategy.impl.PhoneAward;
import award.vo.AwardInfoVO;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author xuanyu peng
 * @description:
 * @date 2023/2/12 22:14
 */

@SpringBootApplication
@EnableDiscoveryClient
public class Test {
    public static void main(String[] args) {
        AwardContext phone = new AwardContext(new PhoneAward());
        AwardContext car = new AwardContext(new CarAward());

        System.out.printf(phone.getAward("phone").doGetAward("phone")+" ");
        System.out.printf("\n");
        System.out.printf(car.getAward("car").doGetAward("car")+" ");



    }
}
