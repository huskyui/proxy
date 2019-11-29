package com.husky.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @author husky
 * @date 2018/12/12 18:50
 */
public class Proxy implements Subject {
    private static Logger logger = LoggerFactory.getLogger(Proxy.class);

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
        logger.info("start :{}",LocalDateTime.now());
    }

    public void after(){
        //do something
        logger.info("end :{}",LocalDateTime.now());
    }

    public static void main(String[] args) {
        Proxy proxy = new Proxy(new RealSubject());
        proxy.request();
    }
}
