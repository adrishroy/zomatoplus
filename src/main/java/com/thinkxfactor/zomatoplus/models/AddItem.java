package com.thinkxfactor.zomatoplus.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_additem")

public class AddItem {
	
	@Id
	@GeneratedValue
	@Column(name="Item_id")
	private long id;
	@Column(name="restaurant_id")
      private long restaurantid;
	@Column(name="name")
	private String name;
	@Column(name="price")
	private String price;
	@Column(name="description")
	private String description;

	public long getid() {
		 return id;
	}
	public AddItem()
	{
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getRestaurantid() {
		return restaurantid;
	}
	public void setRestaurantid(long restaurantid) {
		this.restaurantid = restaurantid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
