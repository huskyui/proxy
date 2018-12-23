package com.husky.dynamicproxy;

/**
 * @author husky
 * @date 2018/12/16 16:44
 */
public class BeforeAdvice implements Iadvice {
    @Override
    public void exec() {
        System.out.println("我是前置通知，我被执行了");
    }
}
