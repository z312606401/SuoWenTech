package cn.SuowenTech.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import cn.SuowenTech.Dao.FeedbackDao;
import cn.SuowenTech.exception.FeedbackAddException;
import cn.SuowenTech.po.Feedback;
import cn.SuowenTech.service.FeedbackService;
import cn.SuowenTech.service.impl.FeedbackServiceImpl;

import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("/feedback")
public class FeedbackController {

	@Resource
	private FeedbackService feedbackService;

	@RequestMapping("/add")
	public void addFeedback(@RequestBody JSONObject request) {

		String feedback_name = request.getString("feedback_name");
		String feedback_email = request.getString("feedback_email");
		String feedback_phone = request.getString("feedback_phone");
		String feedback_content = request.getString("feedback_content");

		JSONObject feedbackInfo = new JSONObject();
		feedbackInfo.put("feedback_name", feedback_name);
		feedbackInfo.put("feedback_email", feedback_email);
		feedbackInfo.put("feedback_phone", feedback_phone);
		feedbackInfo.put("feedback_content", feedback_content);

		try {
			feedbackService.addFeedback(feedbackInfo);
		} catch (FeedbackAddException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/*
	 * @RequestMapping("/add") public void addFeedback(Feedback feedback) {
	 * 
	 * String feedback_name = (String) feedback.getFeedback_name(); String
	 * feedback_email = (String) feedback.getFeedback_email(); int
	 * feedback_phone = feedback.getFeedback_phone(); String feedback_content =
	 * (String) feedback.getFeedback_content();
	 * 
	 * System.out.println("-----------"+feedback); JSONObject feedbackInfo = new
	 * JSONObject(); feedbackInfo.put("feedback_name", feedback_name);
	 * feedbackInfo.put("feedback_email", feedback_email);
	 * feedbackInfo.put("feedback_phone", feedback_phone);
	 * feedbackInfo.put("feedback_content", feedback_content);
	 * 
	 * try { feedbackService.addFeedback(feedbackInfo); } catch
	 * (FeedbackAddException e) { // TODO Auto-generated catch block
	 * e.printStackTrace(); }
	 * 
	 * }
	 */

	/*
	 * @RequestMapping("/test") public String addFeedbackTest(HttpServletRequest
	 * request) throws FeedbackAddException{ Feedback feedback = new Feedback();
	 * String feedback_name = request.getParameter("feedback_name"); String
	 * feedback_content = request.getParameter("feedback_content"); String
	 * feedback_email = request.getParameter("feedback_email"); int
	 * feedback_phone =
	 * Integer.parseInt(request.getParameter("feedback_phone"));
	 * 
	 * feedback.setFeedback_name(feedback_name);
	 * feedback.setFeedback_content(feedback_content);
	 * feedback.setFeedback_email(feedback_email);
	 * //feedback.setFeedback_phone(feedback_phone);
	 * System.out.println("0000000000000000000000000000000000000000000000000000"
	 * ); feedbackService.testaddFeedback(feedback);
	 * 
	 * return"/index.jsp"; }
	 */
	/*
	 * @RequestMapping(value="/test" ,method = RequestMethod.GET,produces =
	 * "application/json;charset=UTF-8") public void test(@RequestBody
	 * JSONObject request) {
	 * 
	 * System.out.println("111"); }
	 * 
	 * @RequestMapping(value="/test2" ,method = RequestMethod.POST,produces =
	 * "application/json;charset=UTF-8") public void test2(@RequestBody
	 * JSONObject request) {
	 * 
	 * System.out.println("111"); }
	 */
}
