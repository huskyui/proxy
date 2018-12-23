package com.husky.dynamicproxy;

import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;

/**
 * @author husky
 * @date 2018/12/16 16:49
 */
public class Client {
    public static void main(String[] args) throws IOException {
        //定义一个代理类
        Subject subject = new RealSubject();
        //定义一个Handler
        InvocationHandler handler = new MyInvocationHandler(subject);
        //定义主题的代理
        Subject proxy = DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(),subject.getClass().getInterfaces(),handler);

        //代理的行为

        System.out.println(proxy.getClass().getCanonicalName());
        proxy.doSomething("finish");

        proxy.eat("香锅里辣家的麻辣香锅");

        //此处可以将
        byte[] proxyClass = ProxyGenerator.generateProxyClass(proxy.getClass()
                .getSimpleName(), proxy.getClass().getInterfaces());
        //将字节码文件保存到D盘，文件名为$Proxy0.class
        FileOutputStream outputStream = new FileOutputStream(new File(
                "d:\\$Proxy0.class"));
        outputStream.write(proxyClass);
        outputStream.flush();
        outputStream.close();

    }
}
