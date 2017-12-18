package com.xiaokong.usercenter.domain;

public class Apartment {
	
	private int id;
	private String apartmentName;
	private String apartmentAdd;
	private String picture;
	private String count;
	private String owner;
	private String ownerTel;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getApartmentName() {
		return apartmentName;
	}
	public void setApartmentName(String apartmentName) {
		this.apartmentName = apartmentName;
	}
	public String getApartmentAdd() {
		return apartmentAdd;
	}
	public void setApartmentAdd(String apartmentAdd) {
		this.apartmentAdd = apartmentAdd;
	}
	
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getOwnerTel() {
		return ownerTel;
	}
	public void setOwnerTel(String ownerTel) {
		this.ownerTel = ownerTel;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}

}
