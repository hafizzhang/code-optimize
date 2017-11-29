package com.hafiz.www;

import com.hafiz.www.domain.Calculator;
import com.hafiz.www.enums.CampaignTypeEnum;
import com.hafiz.www.handler.CampaignHandlerFactory;
import com.hafiz.www.handler.ICampaignHandler;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author hafiz.zhang
 * @description:
 * @date Created in 2017/11/28 21:30.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
@Component
public class DemoTest {

    @Test
    public void test1 () {
        System.out.println(Calculator.calculate(CampaignTypeEnum.PRICE_DISCOUNT.getId()));
        System.out.println(Calculator.calculate(CampaignTypeEnum.PANIC_BUY.getId()));
        System.out.println(Calculator.calculate(CampaignTypeEnum.FULL_DISCOUNT.getId()));
    }

    @Test
    public void test2 () {
        ICampaignHandler handler = CampaignHandlerFactory.getHandler(CampaignTypeEnum.PRICE_DISCOUNT.getId());
        System.out.println("res=" + handler.calculate());
        ICampaignHandler handler1 = CampaignHandlerFactory.getHandler(CampaignTypeEnum.CHEAPEN_OTHER.getId());
        System.out.println("res=" + handler1.calculate());
        ICampaignHandler handler2 = CampaignHandlerFactory.getHandler(CampaignTypeEnum.FULL_DISCOUNT.getId());
        System.out.println("res=" + handler2.calculate());
    }
}
