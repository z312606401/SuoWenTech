package cn.SuowenTech.po;

import java.util.Date;



public class Product {
	
	private int product_id;
	private String product_nameString;
	private String product_describe;
	private Date product_start_timeDate;
	private int picture_id;
	private int admin_id;
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_nameString() {
		return product_nameString;
	}
	public void setProduct_nameString(String product_nameString) {
		this.product_nameString = product_nameString;
	}
	public String getProduct_describe() {
		return product_describe;
	}
	public void setProduct_describe(String product_describe) {
		this.product_describe = product_describe;
	}
	public Date getProduct_start_timeDate() {
		return product_start_timeDate;
	}
	public void setProduct_start_timeDate(Date product_start_timeDate) {
		this.product_start_timeDate = product_start_timeDate;
	}
	public int getPicture_id() {
		return picture_id;
	}
	public void setPicture_id(int picture_id) {
		this.picture_id = picture_id;
	}
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	
	@Override
	public String toString() {
		return "product [product_id=" + product_id + ", product_nameString="
				+ product_nameString + ", product_describe=" + product_describe
				+ ", product_start_timeDate=" + product_start_timeDate
				+ ", picture_id=" + picture_id + ", admin_id=" + admin_id + "]";
	}
	
	
	
	
}
