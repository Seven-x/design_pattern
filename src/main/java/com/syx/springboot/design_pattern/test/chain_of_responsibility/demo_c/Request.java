package com.syx.springboot.design_pattern.test.chain_of_responsibility.demo_c;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author shaoyx 创建时间：2020/5/3 23:20
 * @version 1.0 Copyright(c) 山西九月时空信息技术有限公司
 * @classname design_pattern
 * @description
 **/
@Data
@AllArgsConstructor
public class Request {
    /**
     * 请求类型
     * */
    private String requestType;

    /**
     * 请求内容
     * */
    private String requestContent;

    /**
     * 请求数量
     * */
    private Integer requestNumber;

    @Override
    public String toString() {
        return "请求：{" +
                "requestType='" + requestType + '\'' +
                ", requestContent='" + requestContent + '\'' +
                ", requestNumber=" + requestNumber +
                '}';
    }
}
