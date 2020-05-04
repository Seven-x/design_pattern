package com.syx.springboot.design_pattern.test.chain_of_responsibility.demo_b;

/**
 * @author shaoyx 创建时间：2020/5/3 21:36
 * @version 1.0 Copyright(c) 处理请求
 * @classname design_pattern
 * @description
 **/
public abstract class Handler {

    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    abstract void handleRequest(Integer request);
}
