package com.haina.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.haina.dao.CartDao;
import com.haina.domain.Cart;
import com.haina.service.CartService;
@Service
public class CartServiceImpl implements CartService{
	@Autowired
	private CartDao cdao;

	@Override
	public void addProductToCart(Cart cart) {
		cdao.addProductToCart(cart);
	}

	@Override
	public int getTotalDataCount(Integer userid) {
		return cdao.getTotalDataCount(userid);
	}

	@Override
	public List<Cart> getCartList(Map map) {
		return cdao.getCartList(map);
	}
	
}
