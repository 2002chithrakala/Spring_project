package com.TNS.shopowner;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Shopowner {

	private Integer shop_id;
	private String shop_name;
	private String owner_name;
	private Integer contact;
	private Integer employees;
	public Shopowner() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Shopowner(Integer shop_id, String shop_name, String owner_name, Integer contact, Integer employees) {
		super();
		this.shop_id = shop_id;
		this.shop_name = shop_name;
		this.owner_name = owner_name;
		this.contact = contact;
		this.employees = employees;
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getShop_id() {
		return shop_id;
	}
	public void setShop_id(Integer shop_id) {
		this.shop_id = shop_id;
	}
	public String getShop_name() {
		return shop_name;
	}
	public void setShop_name(String shop_name) {
		this.shop_name = shop_name;
	}
	public String getOwner_name() {
		return owner_name;
	}
	public void setOwner_name(String owner_name) {
		this.owner_name = owner_name;
	}
	public Integer getContact() {
		return contact;
	}
	public void setContact(Integer contact) {
		this.contact = contact;
	}
	public Integer getEmployees() {
		return employees;
	}
	public void setEmployees(Integer employees) {
		this.employees = employees;
	}
	@Override
	public String toString() {
		return "shop_owner [shop_id=" + shop_id + ", shop_name=" + shop_name + ", owner_name=" + owner_name
				+ ", contact=" + contact + ", employees=" + employees + ", getShop_id()=" + getShop_id()
				+ ", getShop_name()=" + getShop_name() + ", getOwner_name()=" + getOwner_name() + ", getContact()="
				+ getContact() + ", getEmployees()=" + getEmployees() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}

