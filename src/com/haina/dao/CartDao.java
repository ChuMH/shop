package com.haina.dao;

import java.util.List;
import java.util.Map;

import com.haina.domain.Cart;

public interface CartDao {
	void addProductToCart(Cart cart);
	int getTotalDataCount(Integer userid);
	List<Cart> getCartList(Map map);
}
