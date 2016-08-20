package cn.SuowenTech.Dao;

import cn.SuowenTech.po.Admin;

import com.alibaba.fastjson.JSONObject;

public interface AdminDao {

	//查找管理员账号（用于登录）
	public Admin findAdmin(JSONObject parameter);

	
	public String findAdminNameById(int admin_id);
	
}
