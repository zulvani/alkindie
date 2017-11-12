package com.alkindie.product.impl;

import com.alkindie.product.api.ProductService;

public class ProductServiceImpl implements ProductService {
    public String save(String s) {
        return "Product " + s + " saved successfully!!!!";
    }
}
