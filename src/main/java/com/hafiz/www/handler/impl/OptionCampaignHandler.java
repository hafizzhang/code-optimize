package com.hafiz.www.handler.impl;


import com.hafiz.www.enums.CampaignTypeEnum;
import com.hafiz.www.event.CampaignHandlerEvent;
import com.hafiz.www.handler.ICampaignHandler;
import com.hafiz.www.spring.SpringAware;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @Description: N元任选活动操作器
 * @author: hafiz.zhang
 * @create: 2017/11/28 20:52.
 */
@Component
public class OptionCampaignHandler implements ICampaignHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(OptionCampaignHandler.class);

    @PostConstruct
    public void init() {
        CampaignHandlerEvent event = new CampaignHandlerEvent(this);
        SpringAware.getApplicationContext().publishEvent(event);
    }


    @Override
    public CampaignTypeEnum getCampaignType() {
        return CampaignTypeEnum.OPTION;
    }

    @Override
    public String calculate() {
        LOGGER.info("N元任选活动计算毛利率");
        return "N元任选活动计算毛利率";
    }
}
