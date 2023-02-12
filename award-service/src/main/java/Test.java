import award.strategy.AwardContext;
import award.strategy.AwardParent;
import award.strategy.impl.PhoneAward;

/**
 * @author xuanyu peng
 * @description:
 * @date 2023/2/12 22:14
 */

public class Test {
    public static void main(String[] args) {
        AwardContext context = new AwardContext(new PhoneAward());
        AwardParent car = context.getAward("car");
        AwardParent phone = context.getAward("phone");


    }
}
