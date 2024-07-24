package org.test.spring.ecommerce_app;

import java.sql.Date;

public class Order {
	
	private long id;
	private String date;
	private double amount;

	
	
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(long id, String date, double amount) {
		super();
		this.id = id;
		this.date = date;
		this.amount = amount;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", date=" + date + ", amount=" + amount + "]";
	}
	
	

}
