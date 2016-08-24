package cn.SuowenTech.service;

import com.alibaba.fastjson.JSONObject;

import cn.SuowenTech.exception.FeedbackAddException;
import cn.SuowenTech.po.Feedback;

public interface FeedbackService {

	public boolean addFeedback(JSONObject parameters) throws FeedbackAddException;
	
	//public boolean testaddFeedback(Feedback feedback) throws FeedbackAddException;
	
	
}
