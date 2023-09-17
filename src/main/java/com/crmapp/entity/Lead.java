package com.crmapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "leads")
public class Lead {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "first_name",length = 45,nullable = false)
	private String firstName;
	@Column(name = "last_name",length = 45,nullable = false)
	private String lastName;
	
	private String leadSource;
	@Column(name = "email",length = 128,nullable = false,unique = true)
	private String email;
	@Column(name = "city",length = 45,nullable = false)
	private String city;
	@Column(name = "mobile",length = 10,nullable = false,unique = true)
	private String mobile;
	public Lead() {
		
	}
	
	public Lead(String firstName, String lastName, String leadSource, String email, String city, String mobile) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.leadSource = leadSource;
		this.email = email;
		this.city = city;
		this.mobile = mobile;
	}

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
	public String getLeadSource() {
		return leadSource;
	}
	public void setLeadSource(String leadSource) {
		this.leadSource = leadSource;
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
	
	

}
