package com.syx.springboot.design_pattern.test.chain_of_responsibility.demo_c;

/**
 * @author shaoyx 创建时间：2020/5/3 23:30
 * @version 1.0 Copyright(c) 总经理
 * @classname design_pattern
 * @description
 **/
public class GeneralManager extends Approver {
    public GeneralManager(String approvalName) {
        super(approvalName);
    }

    @Override
    void handleRequest(Request request) {
        if ("请假".equals(request.getRequestType()) && request.getRequestNumber() > 5){
            System.out.println(approvalName + " 处理：" + request.toString());
        }else {
            if (superApprover != null){
                superApprover.handleRequest(request);
            }
        }
        if ("加薪".equals(request.getRequestType())){
            if (request.getRequestNumber() <= 500){
                System.out.println(approvalName + " 加薪 " + request.toString());
            }else {
                System.out.println(approvalName + " 不加 滚蛋");
            }
        }
    }
}
