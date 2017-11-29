package com.hafiz.www.handler;

import com.hafiz.www.handler.impl.CheapenOtherCampaignHandler;
import com.hafiz.www.handler.impl.FullCutCampaignHandler;
import com.hafiz.www.handler.impl.FullDiscountCampaignHandler;
import com.hafiz.www.handler.impl.FullGIftCampaignHandler;
import com.hafiz.www.handler.impl.OptionCampaignHandler;
import com.hafiz.www.handler.impl.PanicBuyCampaignHandler;
import com.hafiz.www.handler.impl.PriceDiscountCampaignHandler;

/**
 * @author hafiz.zhang
 * @description: 操作器工厂类
 * @date Created in 2017/11/28 22:06.
 */
public class CampaignFactory {
    public static ICampaignHandler getHandler(Integer campaignType) {
        switch (campaignType) {
            case 1:
                return new PriceDiscountCampaignHandler();
            case 2:
                return new FullCutCampaignHandler();
            case 3:
                return new FullGIftCampaignHandler();
            case 4:
                return new CheapenOtherCampaignHandler();
            case 5:
                return new FullDiscountCampaignHandler();
            case 6:
                return new PanicBuyCampaignHandler();
            case 7:
                return new OptionCampaignHandler();
            default:
                throw new RuntimeException("错误的活动类型");
        }
    }
}
