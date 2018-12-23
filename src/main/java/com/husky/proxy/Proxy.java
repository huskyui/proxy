package com.husky.proxy;

/**
 * @author husky
 * @date 2018/12/12 18:50
 */
public class Proxy implements Subject {
    private Subject subject = null;

    public Proxy(Subject subject){
        this.subject = subject;
    }

    @Override
    public void request() {
        before();
        subject.request();
        after();
    }

    public void before(){
        //do something
    }

    public void after(){
        //do something
    }
}
