package com.husky.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @author husky
 * @date 2018/12/16 14:57
 */
public class MyInvocationHandler implements InvocationHandler {


    /**
     * 被代理的对象
     */
    private Object target;

    public MyInvocationHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //log Before
        System.out.println("log before:"+"method: "+method.getName()+ "return :"+method.getReturnType().getSimpleName());
        Object result = method.invoke(target,args);
        System.out.println("log after: "+new Date(System.currentTimeMillis()));
        return result;
    }
}
