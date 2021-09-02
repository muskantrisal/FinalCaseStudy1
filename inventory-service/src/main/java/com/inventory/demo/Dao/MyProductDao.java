package com.inventory.demo.Dao;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.inventory.demo.entities.Product;
import com.inventory.demo.helper.ProductRowMapper;

@Repository
public class MyProductDao implements MyProductDaoInterface{
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public ArrayList<Product> listallProducts(){
		ArrayList<Product> products=(ArrayList<Product>) jdbcTemplate.query("SELECT * FROM Product", new ProductRowMapper());
		return products;
		
		
	}
	

	public Optional<Product> getProductbyCode(String code){
		@SuppressWarnings("deprecation")
		ArrayList<Product> retPro=(ArrayList<Product>) jdbcTemplate.query("SELECT * FROM Product WHERE code=?",new Object[] {code}, new ProductRowMapper());
		return Optional.ofNullable(retPro.get(0));
	}

}
