package com.husky.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author husky
 * @date 2018/12/12 18:48
 */
public class RealSubject implements Subject {
    private static Logger logger = LoggerFactory.getLogger(RealSubject.class);

    @Override
    public void request() {
        //业务逻辑处理
        logger.info("real message : {}","fuck you");
    }
}
