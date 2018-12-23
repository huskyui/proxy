package com.husky.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author husky
 * @date 2018/12/16 16:11
 */
public class DynamicProxy<T> {
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler){
        //寻找JoinPoint连接点，AOP框架使用元数据定义
        if(true){
            new BeforeAdvice().exec();
        }
        //返回目标，并返回结果
        return (T) Proxy.newProxyInstance(loader,interfaces,handler);
    }
}
