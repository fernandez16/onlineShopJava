package com.shop.onlineShopJava.service;

import java.util.List;
import com.shop.onlineShopJava.model.ProductOrder;

public interface ProductOrderService {
	 List<ProductOrder> list();
	 ProductOrder listId(int id);
	 ProductOrder add(ProductOrder p);
	 ProductOrder edit(ProductOrder p);
	 void delete(int id);
}
