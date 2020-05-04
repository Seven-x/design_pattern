package com.syx.springboot.design_pattern.test.chain_of_responsibility.demo_a;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author shaoyx 创建时间：2020/5/3 20:12
 * @version 1.0 Copyright(c) 请假审批 申请信息
 * @classname design_pattern
 * @description
 **/
@Data
@AllArgsConstructor
public class Request {
    /**
     * 申请类型
     * */
    private String requestType;

    /**
     * 申请内容
     * */
    private String requestContent;

    /**
     * 申请数量（请假天数）
     * */
    private Integer requestNumber;

    @Override
    public String toString() {
        return "申请：{" +
                "申请类型='" + requestType + '\'' +
                ", 申请内容='" + requestContent + '\'' +
                ", 申请数量=" + requestNumber +
                '}';
    }
}
