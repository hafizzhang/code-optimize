package com.hafiz.www.enums;

/**
 * @author hafiz.zhang
 * Desc:活动类型
 * Created on 2017/11/28.
 */
public enum CampaignTypeEnum {
    PRICE_DISCOUNT(1, "价格折扣"),
    FULL_CUT(2, "满减"),
    FULL_GIFT(3, "满赠"),
    CHEAPEN_OTHER(4, "换购"),
    FULL_DISCOUNT(5, "满折"),
    PANIC_BUY(6, "抢购"),
    OPTION(7, "N元任选");

    private final Integer id;
    private final String name;

    CampaignTypeEnum(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    /**
     * 根据id获取枚举类
     * @param id
     * @return
     */
    public static CampaignTypeEnum getEnumById(Integer id) {
        for (CampaignTypeEnum item : CampaignTypeEnum.values()) {
            if (item.getId().equals(id)) {
                return item;
            }
        }
        throw new RuntimeException("错误的活动类型~");
    }
}
