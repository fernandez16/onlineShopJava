package com.shop.onlineShopJava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.onlineShopJava.model.Customer;
import com.shop.onlineShopJava.repository.CustomerRepository;

@Service
public class CustomerServiceImp implements CustomerService {

	@Autowired
	private CustomerRepository repository;

	@Override
	public List<Customer> list() {
		return repository.findAll();
	}

	@Override
	public Customer listId(int id) {
		return repository.findById(id);
	}

	@Override
	public Customer add(Customer p) {
		return repository.save(p);
	}

	@Override
	public Customer edit(Customer p) {
		return repository.save(p);
	}

	@Override
	public void delete(int id) {
		Customer p = repository.findById(id);
		if (p != null) {
			repository.delete(p);
		}
	}

}