package cn.SuowenTech.po;

public class Picture {
	
	private int picture_id;
	private String  picture_url;
	private int picture_state;
	private int admin_id;
	public int getPicture_id() {
		return picture_id;
	}
	public void setPicture_id(int picture_id) {
		this.picture_id = picture_id;
	}
	public String getPicture_url() {
		return picture_url;
	}
	public void setPicture_url(String picture_url) {
		this.picture_url = picture_url;
	}
	public int getPicture_state() {
		return picture_state;
	}
	public void setPicture_state(int picture_state) {
		this.picture_state = picture_state;
	}
	public int getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}
	
	@Override
	public String toString() {
		return "picture [picture_id=" + picture_id + ", picture_url="
				+ picture_url + ", picture_state=" + picture_state
				+ ", admin_id=" + admin_id + "]";
	}
	
	
}
