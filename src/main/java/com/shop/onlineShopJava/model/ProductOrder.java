package com.shop.onlineShopJava.model;

import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name = "product_order")
public class ProductOrder {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private Date orderDate;
	
//	@OneToOne(mappedBy = "ProductOrder", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @Column
	private String customerId;
	
	@Column
	private Date deliveryDate;
	
	@Column
	private String status;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public java.sql.Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public Date getDeliveryDate() {
		return deliveryDate;
	}

	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
