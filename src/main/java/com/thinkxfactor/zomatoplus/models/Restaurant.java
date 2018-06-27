package com.thinkxfactor.zomatoplus.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_restaurant")


	public class Restaurant {
	
	@Id
	@GeneratedValue
	@Column(name="restaurant_id")
	private long id;
	
	@Column(name="city")
	private String city;
	@Column(name="name")
		private String name;
	@Column(name="address")
		private String address;
	@Column(name="contact")
	private String contact;
	@Column(name="description")
		private String description;
	@Column(name="website")
	private String website;
	@Column(name="like_count")
		private Integer like_count;
		public Restaurant()
		{
		}
		
		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
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

		public String getContact() {
			return contact;
		}

		public void setContact(String contact) {
			this.contact = contact;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getWebsite() {
			return website;
		}

		public void setWebsite(String website) {
			this.website = website;
		}

		public Integer getLike_count() {
			return like_count;
		}

		public void setLike_count(Integer like_count) {
			this.like_count = like_count;
		}

		public String getname() {
			return name;
		}
		public void setname(String rname) {
			this.name = rname;
		}
		public String getRaddr() {
			return address;
		}
	
}
