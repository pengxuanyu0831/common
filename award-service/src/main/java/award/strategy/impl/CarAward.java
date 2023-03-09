package award.strategy.impl;

import award.strategy.AwardParent;
import award.vo.AwardInfoVO;
import lombok.extern.slf4j.Slf4j;

/**
 * @author xuanyu peng
 * @description:
 * @date 2023/2/12 22:03
 */
@Slf4j
public class CarAward implements AwardParent {
    @Override
    public AwardInfoVO doGetAward(String type) {
        AwardInfoVO vo = new AwardInfoVO();
        vo.setAwardType("car");
        vo.setAwardName("Benz G63");
        log.info("获得 car 类奖品的奖品名为 [" + vo.getAwardName() + "]");
        return vo;
    }
}
