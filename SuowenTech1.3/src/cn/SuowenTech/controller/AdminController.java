package cn.SuowenTech.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import cn.SuowenTech.service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Resource
	private AdminService adminService;
/*
	@RequestMapping("/adminName")
	public String getAdminName(HttpServletRequest request, Model model) throws Exception {

		int admin_id = Integer.parseInt(request.getParameter("id"));

		String admin_name = this.adminService.findAdminNameById(admin_id);
		model.addAttribute("admin_name", admin_name);

		return "/WEB-INF/jsp/adminName.jsp";

	}

*/
	@RequestMapping("/login")
	@ResponseBody
	public String LoginAdmin(@RequestBody JSONObject parameter){
	
		boolean result;
		int admin_id = Integer.parseInt(parameter.getString("admin_id"));
		JSONObject adminInfo  = new JSONObject();
		
		try {
			 result = adminService.findAdmin(parameter);
			 String admin_name = adminService.findAdminNameById(admin_id);
			 
			 adminInfo.put("admin_id", admin_id);
			 adminInfo.put("admin_name", admin_name);	
			 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return adminInfo.toJSONString();
	}
	
	

}
