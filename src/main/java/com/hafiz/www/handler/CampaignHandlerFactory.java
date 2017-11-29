package com.hafiz.www.handler;

import com.hafiz.www.enums.CampaignTypeEnum;
import com.hafiz.www.event.CampaignHandlerEvent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author hafiz.zhang
 * @description: 活动操作器工厂类
 * @date Created in 2017/11/28 20:59.
 */
@Component
public class CampaignHandlerFactory implements ApplicationListener<CampaignHandlerEvent> {

    private static final Logger LOGGER = LoggerFactory.getLogger(CampaignHandlerFactory.class);

    private static Map<CampaignTypeEnum, ICampaignHandler> handlerMap = new ConcurrentHashMap<>();

    /**
     * 通过活动类型获取对应的操作器
     *
     * @param discountType 活动类型
     *
     * @return
     */
    public static ICampaignHandler getHandler(Integer discountType) {
        CampaignTypeEnum discountTypeEnum = CampaignTypeEnum.getEnumById(discountType);
        ICampaignHandler handler = handlerMap.get(discountTypeEnum);
        return handler;
    }

    /**
     * 注册绑定不同类型活动对应的活动操作器
     *
     * @param handler 活动操作器
     *
     */
    private void registerHandler(ICampaignHandler handler) {
        CampaignTypeEnum discountType = handler.getCampaignType();
        LOGGER.info("开始绑定{}类型的活动处理器", discountType.getName());
        handlerMap.put(discountType, handler);
    }

    @Override
    public void onApplicationEvent(CampaignHandlerEvent event) {
        ICampaignHandler handler = (ICampaignHandler) event.getSource();
        this.registerHandler(handler);
    }
}
