package com.alkindie.spring.mvc.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @RequestMapping(method = RequestMethod.GET)
    public List<String> get(){
        List<String> products = new ArrayList<>();
        products.add("iPhone");
        products.add("Samsung Galaxy");
        return products;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity post(){
        return new ResponseEntity(HttpStatus.BAD_GATEWAY);
    }
}
