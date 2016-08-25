package cn.SuowenTech.po;

public class News {

	
		private int news_id;
		private String news_title;
		private String news_writer;
		private String news_start_time;
		private String news_content;
		private int admin_id;
		private int picture_id;
		public int getNews_id() {
			return news_id;
		}
		public void setNews_id(int news_id) {
			this.news_id = news_id;
		}
		public String getNews_title() {
			return news_title;
		}
		public void setNews_title(String news_title) {
			this.news_title = news_title;
		}
		public String getNews_writer() {
			return news_writer;
		}
		public void setNews_writer(String news_writer) {
			this.news_writer = news_writer;
		}
		public String getNews_start_time() {
			return news_start_time;
		}
		public void setNews_start_time(String news_start_time) {
			this.news_start_time = news_start_time;
		}
		public String getNews_content() {
			return news_content;
		}
		public void setNews_content(String news_content) {
			this.news_content = news_content;
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
			return "News [news_id=" + news_id + ", news_title=" + news_title
					+ ", news_writer=" + news_writer + ", news_start_time="
					+ news_start_time + ", news_content=" + news_content
					+ ", admin_id=" + admin_id + ", picture_id=" + picture_id
					+ "]";
		}

		
		
		
}
