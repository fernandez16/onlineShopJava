package com.shop.onlineShopJava.repository;

import java.util.List;
import org.springframework.data.repository.Repository;
import com.shop.onlineShopJava.model.Product;

public interface ProductRepository extends Repository<Product, Integer> {
	List<Product> findAll();

	Product findById(int id);

	Product save(Product p);

	void delete(Product p);
}