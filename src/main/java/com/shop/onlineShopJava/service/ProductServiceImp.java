package com.shop.onlineShopJava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.shop.onlineShopJava.model.Product;
import com.shop.onlineShopJava.repository.ProductRepository;

@Service
public class ProductServiceImp implements ProductService {

	@Autowired
	private ProductRepository repository;

	@Override
	public List<Product> list() {
		return repository.findAll();
	}

	@Override
	public Product listId(int id) {
		return repository.findById(id);
	}

	@Override
	public Product add(Product p) {
		return repository.save(p);
	}

	@Override
	public Product edit(Product p) {
		return repository.save(p);
	}

	@Override
	public void delete(int id) {
		Product p = repository.findById(id);
		if (p != null) {
			repository.delete(p);
		}
	}

}