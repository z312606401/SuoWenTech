package cn.SuowenTech.po;

public class News {

	
		private int news_id;
		private String news_titleString;
		private String news_writerString;
		private String news_start_timeString;
		private String news_contentString;
		private int admin_id;
		private int picture_id;
		public int getNews_id() {
			return news_id;
		}
		public void setNews_id(int news_id) {
			this.news_id = news_id;
		}
		public String getNews_titleString() {
			return news_titleString;
		}
		public void setNews_titleString(String news_titleString) {
			this.news_titleString = news_titleString;
		}
		public String getNews_writerString() {
			return news_writerString;
		}
		public void setNews_writerString(String news_writerString) {
			this.news_writerString = news_writerString;
		}
		public String getNews_start_timeString() {
			return news_start_timeString;
		}
		public void setNews_start_timeString(String news_start_timeString) {
			this.news_start_timeString = news_start_timeString;
		}
		public String getNews_contentString() {
			return news_contentString;
		}
		public void setNews_contentString(String news_contentString) {
			this.news_contentString = news_contentString;
		}
		public int getAdmin_id() {
			return admin_id;
		}
		public void setAdmin_id(int admin_id) {
			this.admin_id = admin_id;
		}
		public int getPicture_id() {
			return picture_id;
		}
		public void setPicture_id(int picture_id) {
			this.picture_id = picture_id;
		}
		
		
		@Override
		public String toString() {
			return "news [news_id=" + news_id + ", news_titleString="
					+ news_titleString + ", news_writerString="
					+ news_writerString + ", news_start_timeString="
					+ news_start_timeString + ", news_contentString="
					+ news_contentString + ", admin_id=" + admin_id
					+ ", picture_id=" + picture_id + "]";
		}
		
		
		
}
