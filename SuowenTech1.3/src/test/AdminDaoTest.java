package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.alibaba.fastjson.JSONObject;

import cn.SuowenTech.service.AdminService;

public class AdminDaoTest {

	Logger logger = Logger.getLogger("TestAccountService");

	AdminService service = null;

	@Before
	public void init() {

		ApplicationContext aCtx = new FileSystemXmlApplicationContext(
				"classpath:spring-mybatis.xml");
		AdminService service = (AdminService) aCtx.getBean("AdminService");
		assertNotNull(service);
		this.service = service;

	}

	@Test
	public void testInsertAccount() throws Exception {


		String admin_name = service.findAdminNameById(1001);
	
		System.out.println(admin_name);

	
	}
	@Test
	public void testFindAdmin() throws Exception{
		JSONObject parameter = new JSONObject();
		parameter.put("admin_password", "123");
		parameter.put("admin_id", "1001");
		
		boolean bo = service.findAdmin(parameter);
		
		System.out.println(bo);
	}

}