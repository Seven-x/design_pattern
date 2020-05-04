package com.syx.springboot.design_pattern.test.chain_of_responsibility.demo_c;

/**
 * @author shaoyx 创建时间：2020/5/3 23:22
 * @version 1.0 Copyright(c) 山西九月时空信息技术有限公司
 * @classname design_pattern
 * @description
 **/
public abstract class Approver {
    protected String approvalName;

    public Approver(String approvalName) {
        this.approvalName = approvalName;
    }

    protected Approver superApprover;

    public void setSuperApprover(Approver superApprover) {
        this.superApprover = superApprover;
    }

    abstract void handleRequest(Request request);
}
