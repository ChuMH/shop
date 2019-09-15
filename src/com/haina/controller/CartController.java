package com.haina.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.haina.dao.ProductDao;
import com.haina.domain.Cart;
import com.haina.domain.Product;
import com.haina.domain.User;
import com.haina.service.CartService;

@Controller
@RequestMapping("/cart")
public class CartController {
	private static final List<Product> Map = null;
	@Autowired
	private CartService cservice;
	@RequestMapping("/addcart")
	public String addCart(String id,HttpSession session,HttpServletResponse response) {
		int pid = Integer.parseInt(id);
		int userid = ((User)session.getAttribute("user")).getId();
		Cart cart = new Cart();
		cart.setUserid(userid);
		cart.setPid(pid);
		cart.setCount(1);
		cservice.addProductToCart(cart);
		return "redirect:/cart/showcart.do";
	}
	@RequestMapping("/showcart")
	public String showCart(HttpSession session,Model m,String pageNo) {
		User user = (User)session.getAttribute("user");
		int pagesize=5;
		int currentPage = 1;
		int totalDateCount = 0;
		int totalPageCount= 0;
		totalDateCount = cservice.getTotalDataCount(user.getId());
		if(totalDateCount%pagesize==0)
			totalPageCount = totalDateCount/pagesize;
		else
			totalPageCount = totalDateCount/pagesize+1;
		m.addAttribute("totalPageCount", totalPageCount);
		if(pageNo!=null)
			currentPage = Integer.parseInt(pageNo);
		if(currentPage > totalPageCount)
			currentPage = totalPageCount;
		if(currentPage < 1)
			currentPage = 1;
		m.addAttribute("currentPage", currentPage);
		
		Map map = new HashMap<>();
		map.put("userid", user.getId());
		map.put("startlocation",(currentPage-1)*pagesize);
		map.put("length", pagesize);
		
		
		List<Cart> list = cservice.getCartList(map);
		Iterator<Cart> it = list.iterator();
		List<Product> plist = new ArrayList<>();
		while(it.hasNext()) {
			plist.add(it.next().getProduct());
		}
		System.out.println(plist+"---------");
		m.addAttribute("cartlist",plist);
		return "cart";
	}
	@RequestMapping("account")
	public String account() {
		
		return "orders";
	}
}
