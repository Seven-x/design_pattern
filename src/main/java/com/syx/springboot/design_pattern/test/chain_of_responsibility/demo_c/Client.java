package com.syx.springboot.design_pattern.test.chain_of_responsibility.demo_c;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shaoyx 创建时间：2020/5/3 23:43
 * @version 1.0 Copyright(c) 山西九月时空信息技术有限公司
 * @classname design_pattern
 * @description
 **/
public class Client {

    public static void main(String[] args) {
        Approver approverA = new CommonManager("A_boss");
        Approver approverB = new MajorManager("B_boss");
        Approver approverC = new GeneralManager("C_boss");
        approverA.setSuperApprover(approverB);
        approverB.setSuperApprover(approverC);

        Request requestA = new Request("请假", "陪老婆", 2);
        Request requestB = new Request("请假", "陪老婆", 5);
        Request requestC = new Request("请假", "陪老婆", 10);
        Request requestD = new Request("加薪", "养老婆", 500);
        Request requestE = new Request("加薪", "养老婆", 1000);

        approverA.handleRequest(requestA);
        approverA.handleRequest(requestB);
        approverA.handleRequest(requestC);
        approverA.handleRequest(requestD);
        approverA.handleRequest(requestE);
    }
}
