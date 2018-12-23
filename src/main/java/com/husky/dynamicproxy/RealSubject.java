package com.husky.dynamicproxy;

/**
 * @author husky
 * @date 2018/12/16 14:55
 */
public class RealSubject implements Subject {
    @Override
    public void doSomething(String str) {
        System.out.println("do something!---->" + str);
    }

    @Override
    public void eat(String str) {
        System.out.println("今天晚上吃"+str);
    }
}
