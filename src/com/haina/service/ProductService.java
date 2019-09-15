package com.haina.service;

import java.util.List;
import java.util.Map;

import com.haina.domain.Product;

public interface ProductService {
	int getTotalDataCountBySearch(String search);
	List<Product> showproductBySearch(Map map);
}
