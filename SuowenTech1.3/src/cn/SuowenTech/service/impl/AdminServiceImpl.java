package cn.SuowenTech.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;

import cn.SuowenTech.Dao.AdminDao;
import cn.SuowenTech.po.Admin;
import cn.SuowenTech.service.AdminService;

@Service()
public class AdminServiceImpl implements AdminService {

	@Resource
	private AdminDao adminDao;
	

	@Override
	public String findAdminNameById(int admin_id) throws Exception {

		String admin_name = adminDao.findAdminNameById(admin_id);

		return admin_name;
	}

	@Override
	public boolean findAdmin(JSONObject parameter) throws Exception {

		Admin admin = adminDao.findAdmin(parameter);

		if (admin == null) {
			return false;
		} else {
			return true;
		}

	}

}
