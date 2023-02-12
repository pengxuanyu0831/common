package award.vo;

/**
 * @author xuanyu peng
 * @description:
 * @date 2023/2/12 22:01
 */
public class AwardInfoVO {
    private String awardName;

    private String awardType;

    public AwardInfoVO(final String awardName, final String awardType) {
        this.awardName = awardName;
        this.awardType = awardType;
    }

    public AwardInfoVO() {
    }

    public String getAwardName() {
        return this.awardName;
    }

    public void setAwardName(final String awardName) {
        this.awardName = awardName;
    }

    public String getAwardType() {
        return this.awardType;
    }

    public void setAwardType(final String awardType) {
        this.awardType = awardType;
    }
}
