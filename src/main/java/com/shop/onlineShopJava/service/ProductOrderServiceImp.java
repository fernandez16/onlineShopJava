package com.shop.onlineShopJava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shop.onlineShopJava.model.ProductOrder;
import com.shop.onlineShopJava.repository.ProductOrderRepository;

@Service
public class ProductOrderServiceImp implements ProductOrderService {

	@Autowired
	private ProductOrderRepository repository;

	@Override
	public List<ProductOrder> list() {
		return repository.findAll();
	}

	@Override
	public ProductOrder listId(int id) {
		return repository.findById(id);
	}

	@Override
	public ProductOrder add(ProductOrder p) {
		return repository.save(p);
	}

	@Override
	public ProductOrder edit(ProductOrder p) {
		return repository.save(p);
	}

	@Override
	public void delete(int id) {
		ProductOrder p = repository.findById(id);
		if (p != null) {
			repository.delete(p);
		}
	}

}