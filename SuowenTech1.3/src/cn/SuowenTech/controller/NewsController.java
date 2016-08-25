package cn.SuowenTech.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import cn.SuowenTech.po.News;
import cn.SuowenTech.service.NewsService;

@Controller
@RequestMapping("/News")
public class NewsController {

	@Resource
	private NewsService newsService;

	@RequestMapping("/find")
	@ResponseBody
	public String findNews(@RequestParam("news_id" )int news_id) {
		News news = newsService.findNewsById(news_id);
		
		JSONObject newsInfo = new JSONObject();
		
		newsInfo.put("news_title", news.getNews_title());
		newsInfo.put("news_writer", news.getNews_writer());
		newsInfo.put("news_start_time", news.getNews_start_time());
		newsInfo.put("news_content", news.getNews_content());
		newsInfo.put("picture_id", news.getPicture_id());
		
		return newsInfo.toJSONString();
		
	}
}
