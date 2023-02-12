package award.strategy.impl;

import award.strategy.AwardParent;
import award.vo.AwardInfoVO;

/**
 * @author xuanyu peng
 * @description:
 * @date 2023/2/12 22:03
 */
public class CarAward implements AwardParent {
    @Override
    public AwardInfoVO doGetAward(String type) {
        AwardInfoVO vo = new AwardInfoVO();
        vo.setAwardType("car");
        vo.setAwardName("Benz G63");
        System.out.printf("获得 car 类奖品的奖品名为 [" + vo.getAwardName() + "]");
        return vo;
    }
}
