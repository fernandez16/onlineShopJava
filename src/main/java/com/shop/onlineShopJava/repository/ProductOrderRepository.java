package com.shop.onlineShopJava.repository;

import java.util.List;
import org.springframework.data.repository.Repository;
import com.shop.onlineShopJava.model.ProductOrder;

public interface ProductOrderRepository extends Repository<ProductOrder, Integer> {
	List<ProductOrder> findAll();

	ProductOrder findById(int id);

	ProductOrder save(ProductOrder p);

	void delete(ProductOrder p);
}