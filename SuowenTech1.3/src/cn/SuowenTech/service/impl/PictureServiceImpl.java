package cn.SuowenTech.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.SuowenTech.Dao.PictureDao;
import cn.SuowenTech.service.PictureService;

@Service
public class PictureServiceImpl implements PictureService {

	@Resource
	private PictureDao pictureDao;
	
	
	@Override
	public String findPictureById(int picture_id) {
		
		String picture_url = pictureDao.findPictureById(picture_id);
			
		return picture_url;
	}

}
