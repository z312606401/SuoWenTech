package cn.SuowenTech.po;

import java.util.Date;



public class Product {
	
	private int product_id;
	private String product_name;
	private String product_describe;
	private Date product_start_time;
	private int picture_id;
	private int admin_id;
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	
	public String getProduct_describe() {
		return product_describe;
	}
	public void setProduct_describe(String product_describe) {
		this.product_describe = product_describe;
	}
	
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public Date getProduct_start_time() {
		return product_start_time;
	}
	public void setProduct_start_time(Date product_start_time) {
		this.product_start_time = product_start_time;
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
		return "Product [product_id=" + product_id + ", product_name="
				+ product_name + ", product_describe=" + product_describe
				+ ", product_start_time=" + product_start_time
				+ ", picture_id=" + picture_id + ", admin_id=" + admin_id + "]";
	}
	

	
	
	
	
}
