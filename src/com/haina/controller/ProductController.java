package com.haina.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.haina.dao.ProductDao;
import com.haina.domain.Product;
import com.haina.domain.User;
import com.haina.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private ProductService pservice;
	@RequestMapping("/search")
	public String search(String search,String search2,Model m,String currentPage2) {
		int pagesize=5;
		int currentPage = 1;
		int totalDateCount = 0;
		int totalPageCount= 0;
		
		if(search == null)
			search = search2;
		m.addAttribute("search", search);
		totalDateCount = pservice.getTotalDataCountBySearch(search);
		//totalDateCount = new ProductDao().searchCountByWords(search);
		if(totalDateCount%pagesize==0)
			totalPageCount = totalDateCount/pagesize;
		else
			totalPageCount = totalDateCount/pagesize+1;
		if(currentPage2 != null) {
			currentPage = Integer.parseInt(currentPage2);
		}
			
		if(currentPage > totalPageCount)
			currentPage = totalPageCount;
		if(currentPage < 1)
			currentPage = 1;
		m.addAttribute("currentPage", currentPage);
		m.addAttribute("totalPageCount", totalPageCount);
		Map map = new HashMap<>();
		map.put("search", search);
		map.put("startlocation", (currentPage-1)*pagesize);
		map.put("length", pagesize);
		List<Product> list = pservice.showproductBySearch(map);
		//List<Product> list = new ProductDao().getProductInfo(search, (currentPage-1)*pagesize, pagesize);
		m.addAttribute("productlist", list);
		return "search";
	}
}
