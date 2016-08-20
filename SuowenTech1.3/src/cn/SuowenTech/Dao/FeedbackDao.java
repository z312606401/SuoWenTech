package cn.SuowenTech.Dao;

import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

import cn.SuowenTech.po.Feedback;


public interface FeedbackDao {
/*
	//test
	public int testaddFeedback(Feedback feedback);

*/	public int addFeedback(JSONObject parameters);
	
	public int deleteFeedback(int feedback_id);
	
	
}
