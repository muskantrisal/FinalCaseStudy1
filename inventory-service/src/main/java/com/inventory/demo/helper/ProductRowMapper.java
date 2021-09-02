package com.inventory.demo.helper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.inventory.demo.entities.Product;

public class ProductRowMapper implements RowMapper<Product>{
	
	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		Product product=new Product();
		
		product.setProductId((rs.getInt("productId")));
		product.setCode(rs.getString("code"));
		product.setName(rs.getString("name"));
		product.setDescription(rs.getString("description"));
		product.setPrice(rs.getDouble("price"));
		
		return product;
	}

	
	

}



