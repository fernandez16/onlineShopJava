package com.shop.onlineShopJava.service;

import java.util.List;
import com.shop.onlineShopJava.model.Customer;

public interface CustomerService {
	 List<Customer> list();
	 Customer listId(int id);
	 Customer add(Customer p);
	 Customer edit(Customer p);
	 void delete(int id);
}
