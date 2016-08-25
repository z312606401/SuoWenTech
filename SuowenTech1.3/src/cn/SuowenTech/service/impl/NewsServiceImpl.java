package cn.SuowenTech.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.SuowenTech.Dao.NewsDao;
import cn.SuowenTech.po.News;
import cn.SuowenTech.service.NewsService;

@Service
public class NewsServiceImpl implements NewsService{

	@Resource
	private NewsDao newsDao;
	@Override
	public News findNewsById(int news_id) {
		// TODO Auto-generated method stub
		News news = newsDao.findNewsById(news_id);
		return news;
	}

}
