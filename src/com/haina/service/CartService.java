package com.haina.service;

import java.util.List;
import java.util.Map;

import com.haina.domain.Cart;

public interface CartService {
	void addProductToCart(Cart cart);
	int getTotalDataCount(Integer userid);
	List<Cart> getCartList(Map map);
}
