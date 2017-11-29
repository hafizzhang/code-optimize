package com.hafiz.www.handler;

import com.hafiz.www.enums.CampaignTypeEnum;

/**
 * @author hafiz.zhang
 * @description: 计算毛利率接口
 * @date Created in 2017/11/28 20:57.
 */
public interface ICampaignHandler {

    CampaignTypeEnum getCampaignType();
    /**
     * 计算毛利率
     * @return
     */
    String calculate();
}
