package com.crmapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Billings")
public class Billing {
	@Id
	private long id;
	@Column(name = "first_name",length = 45,nullable = false)
	private String firstName;
	@Column(name = "last_name",length = 45,nullable = false)
	private String lastName;
	@Column(name = "email",length = 128,nullable = false,unique = true)
	private String email;
	@Column(name = "city",length = 45,nullable = false)
	private String city;
	@Column(name = "mobile",length = 10,nullable = false,unique = true)
	private String mobile;
	@Column(name = "product",length = 45,nullable = false)
	private String product;
	@Column(nullable = false)
	private String amount;
	@Column(nullable = false)
	private String mode;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	
	
	

	

}
