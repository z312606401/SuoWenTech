package cn.SuowenTech.controller;

import javax.annotation.Resource;
import javax.ejb.FinderException;
import javax.management.loading.PrivateClassLoader;

import org.junit.runners.Parameterized.Parameter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import cn.SuowenTech.Dao.ProductDao;
import cn.SuowenTech.po.Product;
import cn.SuowenTech.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Resource
	private ProductService productService;

	@RequestMapping("/find")
	@ResponseBody
	public String FindProduct(@RequestParam("product_id") int product_id) {

		int state = productService.findProduct(product_id);
		JSONObject productInfo = new JSONObject();

		if (state != 0) {
			// 产品存在
			Product product = productService.findProductById(product_id);
			productInfo.put("product_id", product.getPicture_id());
			productInfo.put("product_name", product.getProduct_name());
			productInfo.put("product_describe", product.getProduct_describe());
			productInfo.put("product_start_time",
					product.getProduct_start_time());
			productInfo.put("state", 1);

			return productInfo.toJSONString();
		} else {
			productInfo.put("state", 0);
			return productInfo.toJSONString();
		}

	}

}
