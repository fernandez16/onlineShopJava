package com.shop.onlineShopJava.service;

import java.util.List;
import com.shop.onlineShopJava.model.Product;

public interface ProductService {
	 List<Product> list();
	 Product listId(int id);
	 Product add(Product p);
	 Product edit(Product p);
	 void delete(int id);
}