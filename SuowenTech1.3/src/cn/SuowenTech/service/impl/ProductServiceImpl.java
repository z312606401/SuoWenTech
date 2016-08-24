package cn.SuowenTech.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.SuowenTech.Dao.ProductDao;
import cn.SuowenTech.po.Product;
import cn.SuowenTech.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	@Resource
	private ProductDao productDao;

	@Override
	public Product findProductById(int product_id) {
		// TODO Auto-generated method stub

		Product product = productDao.findProductById(product_id);
		return product;
	}

	@Override
	public int findProduct(int product_id) {
		// TODO Auto-generated method stub
		
		
		return productDao.findProduct(product_id);
	}

}
