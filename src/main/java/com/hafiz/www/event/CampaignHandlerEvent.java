package com.hafiz.www.event;

import com.hafiz.www.handler.ICampaignHandler;
import org.springframework.context.ApplicationEvent;

/**
 * @author hafiz.zhang
 * @description: 活动操作器事件
 * @date Created in 2017/11/28 21:02.
 */
public class CampaignHandlerEvent extends ApplicationEvent {

    public CampaignHandlerEvent(ICampaignHandler source) {
        super(source);
    }
}
