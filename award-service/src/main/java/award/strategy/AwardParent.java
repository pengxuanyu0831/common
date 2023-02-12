package award.strategy;

import award.vo.AwardInfoVO;

/**
 * @author xuanyu peng
 * @description:
 * @date 2023/2/12 22:01
 */
public interface AwardParent {
    AwardInfoVO doGetAward(String type);
}
