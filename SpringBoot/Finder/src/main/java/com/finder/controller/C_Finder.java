package com.finder.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.finder.dto.Product;

@RestController
public class C_Finder {
	
	@RequestMapping("/product")
	public Product product(@RequestParam(value = "id", defaultValue = "0") String id) {
		
		Product product = new Product();
		product.setId(1);
		product.setName("SpyHunter");
		
		return product;
	}
}