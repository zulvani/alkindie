package com.alkindie.product.consumer;

import com.alkindie.product.api.ProductService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"META-INF/spring/product-consumer.xml"});
        context.start();
        ProductService productService = (ProductService) context.getBean("productService");
        String product = productService.save("iPhone");
        System.out.println(product);
        System.in.read();
    }
}
