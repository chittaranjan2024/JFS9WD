package org.test.spring.ecommerce_app;

import java.util.Set;
import java.util.Set;

public class Customer {
	
	private int id;
	private String name;
	private String address;
	private Set<Long> phones;
	private Order order;
	
	public Customer() {
		
	}
	
	
	public Customer(int id, String name, String address, Set<Long> phones, Order order) {
		
		this.id = id;
		this.name = name;
		this.address = address;
		this.phones = phones;
		this.order = order;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Set<Long> getPhones() {
		return phones;
	}
	public void setPhones(Set<Long> phones) {
		this.phones = phones;
	}


	public Order getOrder() {
		return order;
	}


	public void setOrder(Order order) {
		this.order = order;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", address=" + address + ", phones=" + phones + ", order="
				+ order + "]";
	}
    
	

}
