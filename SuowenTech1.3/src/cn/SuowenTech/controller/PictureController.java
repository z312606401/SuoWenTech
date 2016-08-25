package cn.SuowenTech.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	
	@RequestMapping(value = "find")
	public Model getPicture(@RequestParam("picture_id") int picture_id,Model model){
		
		String picture_url = pictureService.findPictureById(picture_id);
		model.addAttribute("picture_url", picture_url);
		return model;
	}
}
