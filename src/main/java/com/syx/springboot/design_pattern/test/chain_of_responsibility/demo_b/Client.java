package com.syx.springboot.design_pattern.test.chain_of_responsibility.demo_b;

/**
 * @author shaoyx 创建时间：2020/5/3 22:44
 * @version 1.0 Copyright(c) 山西九月时空信息技术有限公司
 * @classname design_pattern
 * @description
 **/
public class Client {
    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();
        handlerA.setSuccessor(handlerB);
        handlerB.setSuccessor(handlerC);

        int[] req = new int[]{2, 5, 14, 22, 18, 3, 27, 20, 100};
        for (int request : req){
            handlerA.handleRequest(request);
        }

    }
}
