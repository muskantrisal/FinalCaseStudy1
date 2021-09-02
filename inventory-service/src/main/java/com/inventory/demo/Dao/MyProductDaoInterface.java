package com.inventory.demo.Dao;

import java.util.ArrayList;
import java.util.Optional;

import com.inventory.demo.entities.Product;

public interface MyProductDaoInterface {
	
    ArrayList<Product> listallProducts();
	
	Optional<Product> getProductbyCode(String code);


}
