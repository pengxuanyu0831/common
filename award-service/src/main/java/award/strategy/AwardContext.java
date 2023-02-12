package award.strategy;

import award.strategy.impl.CarAward;
import award.strategy.impl.PhoneAward;
import award.vo.AwardInfoVO;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author xuanyu peng
 * @description: 获取奖品上下文类
 * @date 2023/2/12 22:05
 */
public class AwardContext {
    private AwardParent awardParent;

    private static final Map<String, AwardParent> map = new ConcurrentHashMap<>();

    static {
        map.put("car", new CarAward());
        map.put("phone", new PhoneAward());
    }

    public AwardContext(final AwardParent awardParent) {
        this.awardParent = awardParent;
    }

    public AwardContext() {
    }

    public AwardParent getAward(String strs) {
        return map.get(strs);
    }
}
