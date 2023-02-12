package award.strategy.impl;

import award.strategy.AwardParent;
import award.vo.AwardInfoVO;

/**
 * @author xuanyu peng
 * @description:
 * @date 2023/2/12 22:04
 */
public class PhoneAward implements AwardParent {
    @Override
    public AwardInfoVO doGetAward(String type) {
        AwardInfoVO vo = new AwardInfoVO();
        vo.setAwardName("iPhone14 ProMax 1TB");
        vo.setAwardType("phone");
        System.out.printf("获得 phone 类奖品的奖品名为 [" + vo.getAwardName() + "]");
        return vo;
    }
}
