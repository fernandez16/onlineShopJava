package com.shop.onlineShopJava.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.shop.onlineShopJava.model.Customer;
import com.shop.onlineShopJava.service.CustomerService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/customers")
public class CustomerController {

	@Autowired
	CustomerService service;

	@GetMapping
	public List<Customer> list() {
		return service.list();
	}

	@PostMapping
	public Customer add(@RequestBody Customer p) {
		return service.add(p);
	}

	@PutMapping(path = { "/{id}" })
	public Customer edit(@RequestBody Customer p, @PathVariable("id") int id) {
		p.setId(id);
		return service.edit(p);
	}

	@DeleteMapping(path = { "/{id}" })
	public void delete(@PathVariable("id") int id) {
		service.delete(id);
	}

}
