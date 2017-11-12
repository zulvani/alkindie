package com.alkindie.product.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"META-INF/spring/product-provider.xml"});
        context.start();
        System.in.read(); // press any key to exit
    }
}
