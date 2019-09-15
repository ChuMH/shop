package com.haina.dao;

import java.util.List;
import java.util.Map;

import com.haina.domain.Product;

public interface ProductDao {
	int getTotalDataCountBySearch(String search);
	List<Product> showproductBySearch(Map map);
	Product selectProductById(Integer pid);
}
