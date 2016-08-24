package cn.SuowenTech.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.SuowenTech.po.Picture;
import cn.SuowenTech.service.PictureService;

@Controller
@RequestMapping("/picture")
public class PictureController {
	
	@Resource
	private PictureService pictureService;
	
	@RequestMapping(value = "find",method=RequestMethod.GET ,produces="application/json;charset=utf-8")
	@ResponseBody
	public String getPicture(@RequestParam("picture_id") int picture_id){
		return pictureService.findPictureById(picture_id);		
	}
}
