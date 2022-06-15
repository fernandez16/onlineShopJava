package com.shop.onlineShopJava.repository;

import java.util.List;
import org.springframework.data.repository.Repository;
import com.shop.onlineShopJava.model.Customer;

public interface CustomerRepository extends Repository<Customer, Integer> {
	List<Customer> findAll();

	Customer findById(int id);

	Customer save(Customer p);

	void delete(Customer p);
}