package com.syx.springboot.design_pattern.test.chain_of_responsibility.demo_a;

/**
 * @author shaoyx 创建时间：2020/5/3 20:19
 * @version 1.0 Copyright(c) 请假审批 审批人
 * @classname design_pattern
 * @description
 **/
public class Approver {

    private String approverName;

    /**
     * 得到审批结果
     * 审批步骤：
     * 请假天数 <= 2 经理审批
     * 请假天数 <= 5 总监审批
     * 申请加薪 总经理审批
     **/
    public void getApprovalResult(Request request) {
        if ("请假".equals(request.getRequestType()) && request.getRequestNumber() <= 2) {
            approverName = "经理";
            System.out.println(approverName + " 批准： " + request.toString());
            return;
        } else {
            System.out.println(approverName + " 无权审批,需向上级申请： " + request.toString());
        }
        if ("请假".equals(request.getRequestType()) && request.getRequestNumber() <= 5) {
            approverName = "总监";
            System.out.println(approverName + " 批准： " + request.toString());
            return;
        } else {
            System.out.println(approverName + " 无权审批,需向上级申请： " + request.toString());
        }
        if ("请假".equals(request.getRequestType())) {
            approverName = "总经理";
            System.out.println(approverName + " 批准： " + request.toString());
        } else if ("加薪".equals(request.getRequestType())) {
            if (request.getRequestNumber() < 500) {
                approverName = "总经理";
                System.out.println(approverName + " 批准： " + request.toString());
                return;
            } else {
                approverName = "总经理";
                System.out.println(approverName + " 不批准： " + request.toString());
            }
        }
    }
}

