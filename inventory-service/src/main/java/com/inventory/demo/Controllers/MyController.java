package com.inventory.demo.Controllers;


import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.inventory.demo.Service.MyProductService;

import com.inventory.demo.entities.Product;

@RestController
public class MyController {
	
	
	@Autowired
	MyProductService productService;
	
	

	
	@GetMapping("/products")
	public ArrayList<Product> listProducts(){
		
		
		return productService.listallProducts();
		
	}
	
	@GetMapping("/products/code/{code}")
	public Optional<Product> getProductbyCode(@PathVariable String code) {
		
		return productService.getProductbyCode(code);
		
		
	}
	
	
	

	
	
	
	
	
	

}
