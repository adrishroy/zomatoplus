package com.thinkxfactor.zomatoplus.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;


@Entity
@Table(name="tbl_user")
public class User implements Serializable
{
	@Id
	@GeneratedValue
	private long id;
	@Column(name="name",unique=true)
	private String name;
	@Column(name="type")
	private String type;
	@Column(name="mobile")
	private Integer mobile;
	@Column(name="address")
	private String address;
	@Column(name="password")
	private String password;
	@Column(name="landmark")
	private String landmark;
	@Column(name="pincode")
	private Integer pincode;
	public User()
	{
	}
	
	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getMobile() {
		return mobile;
	}

	public void setMobile(Integer mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	public void setId(long id) {
		this.id = id;
	}

	
	
	
	
}