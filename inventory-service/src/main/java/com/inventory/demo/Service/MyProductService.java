package com.inventory.demo.Service;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inventory.demo.Dao.MyProductDao;
import com.inventory.demo.entities.Product;

@Service
public class MyProductService implements MyProductServiceInterface{
	
	@Autowired
	MyProductDao productDao;
	
	public ArrayList<Product> listallProducts(){
		
		return productDao.listallProducts();
		
		
		
		
	}
	
	public Optional<Product> getProductbyCode(String code) {
		
		return productDao.getProductbyCode(code);
		
	}

}
