package com.syx.springboot.design_pattern.test.chain_of_responsibility.demo_c;

/**
 * @author shaoyx 创建时间：2020/5/3 23:27
 * @version 1.0 Copyright(c) 经理
 * @classname design_pattern
 * @description
 **/
public class CommonManager extends Approver {

    public CommonManager(String approvalName) {
        super(approvalName);
    }

    @Override
    void handleRequest(Request request) {
        if ("请假".equals(request.getRequestType()) && request.getRequestNumber() <= 2){
            System.out.println(approvalName + " 处理：" + request.toString());
        }else {
            if (superApprover != null){
                superApprover.handleRequest(request);
            }
        }
    }
}
