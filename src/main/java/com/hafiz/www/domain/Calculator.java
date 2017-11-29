package com.hafiz.www.domain;

/**
 * @author hafiz.zhang
 * @description: 活动毛利率计算器
 * @date Created in 2017/11/28 20:52.
 */
public class Calculator {

    public static String calculate(Integer campaignType) {
        switch (campaignType) {
            case 1:
                return "价格折扣活动计算毛利率";
            case 2:
                return "满减活动计算毛利率";
            case 3:
                return "满赠活动计算毛利率";
            case 4:
                return "换购活动计算毛利率";
            case 5:
                return "满折活动计算毛利率";
            case 6:
                return "抢购活动计算毛利率";
            case 7:
                return "N元任选活动计算毛利率";
            default:
                return "错误的活动类型";
        }
    }
}
