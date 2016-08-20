package cn.SuowenTech.po;

public class Feedback {

	private int feedback_id;
	private int feedback_phone;
	private String feedback_email;
	private String feedback_content;
	private String feedback_name;
	public int getFeedback_id() {
		return feedback_id;
	}
	public void setFeedback_id(int feedback_id) {
		this.feedback_id = feedback_id;
	}
	public int getFeedback_phone() {
		return feedback_phone;
	}
	public void setFeedback_phone(int feedback_phone) {
		this.feedback_phone = feedback_phone;
	}
	public String getFeedback_email() {
		return feedback_email;
	}
	public void setFeedback_email(String feedback_email) {
		this.feedback_email = feedback_email;
	}
	public String getFeedback_content() {
		return feedback_content;
	}
	public void setFeedback_content(String feedback_content) {
		this.feedback_content = feedback_content;
	}
	
	public String getFeedback_name() {
		return feedback_name;
	}
	public void setFeedback_name(String feedback_name) {
		this.feedback_name = feedback_name;
	}
	@Override
	public String toString() {
		return "Feedback [feedback_id=" + feedback_id + ", feedback_phone="
				+ feedback_phone + ", feedback_email=" + feedback_email
				+ ", feedback_content=" + feedback_content + ", feedback_name="
				+ feedback_name + "]";
	}


	
	
	
	
	
}
