package com.inventory.demo.Service;

import java.util.ArrayList;
import java.util.Optional;

import com.inventory.demo.entities.Product;

public interface MyProductServiceInterface {
	
	public ArrayList<Product> listallProducts();
	public Optional<Product> getProductbyCode(String code);

}
