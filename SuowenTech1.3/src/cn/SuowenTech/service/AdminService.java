package cn.SuowenTech.service;

import com.alibaba.fastjson.JSONObject;

public interface AdminService {

	public boolean findAdmin(JSONObject parameter) throws Exception;

	public String findAdminNameById(int admin_id) throws Exception;
	
}
