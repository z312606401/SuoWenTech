 package cn.SuowenTech.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import cn.SuowenTech.Dao.FeedbackDao;
import cn.SuowenTech.exception.FeedbackAddException;
import cn.SuowenTech.po.Feedback;
import cn.SuowenTech.po.Picture;
import cn.SuowenTech.service.FeedbackService;

@Service
public class FeedbackServiceImpl implements FeedbackService {

	@Autowired
	private FeedbackDao feedbackDao;

	@Override
	public boolean addFeedback(JSONObject parameters) throws FeedbackAddException {

		int result = 0;
		try {
			result = feedbackDao.addFeedback(parameters);
		} catch (Exception e) {
			// e.printStackTrace();
			throw new FeedbackAddException("添加反馈信息失败");
		}
		if (result == 1) {
			return true;
		} else {
			return false;

		}
	}
/*
	@Override
	public boolean testaddFeedback(Feedback feedback)
			throws FeedbackAddException {
	
		
		feedbackDao.testaddFeedback(feedback);
		return false;
	}
	*/
	
}
