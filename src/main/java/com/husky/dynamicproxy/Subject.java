package com.husky.dynamicproxy;

/**
 * @author husky
 * @date 2018/12/16 14:19
 */
public interface Subject {
    /**
     * //业务操作
     * @param str
     */
    void doSomething(String str);


    /**
     * 吃
     * */
    void eat(String str);
}
