package award.strategy.impl;

import award.strategy.AwardParent;
import award.vo.AwardInfoVO;
import lombok.extern.slf4j.Slf4j;

/**
 * @author xuanyu peng
 * @description:
 * @date 2023/2/12 22:04
 */
@Slf4j
public class PhoneAward implements AwardParent {
    @Override
    public AwardInfoVO doGetAward(String type) {
        AwardInfoVO vo = new AwardInfoVO();
        vo.setAwardName("iPhone14 ProMax 1TB");
        vo.setAwardType("phone");
        log.info("获得 phone 类奖品的奖品名为 [" + vo.getAwardName() + "]");
        return vo;
    }
}
