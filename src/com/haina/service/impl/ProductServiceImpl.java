package com.haina.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haina.dao.ProductDao;
import com.haina.domain.Product;
import com.haina.service.ProductService;
@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao pdao;

	@Override
	public int getTotalDataCountBySearch(String search) {
		return pdao.getTotalDataCountBySearch(search);
	}

	@Override
	public List<Product> showproductBySearch(Map map) {
		return pdao.showproductBySearch(map);
	}
	
	
}
