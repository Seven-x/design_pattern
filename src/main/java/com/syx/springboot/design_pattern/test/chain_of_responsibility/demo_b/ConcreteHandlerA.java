package com.syx.springboot.design_pattern.test.chain_of_responsibility.demo_b;

/**
 * @author shaoyx 创建时间：2020/5/3 21:48
 * @version 1.0 Copyright(c) 山西九月时空信息技术有限公司
 * @classname design_pattern
 * @description
 **/
public class ConcreteHandlerA extends Handler {
    @Override
    void handleRequest(Integer request) {
        if (request <= 10) {
            System.out.println(this.getClass().getName() + " 处理：" + request);
        } else if (successor != null){
            successor.handleRequest(request);
        }
    }
}
