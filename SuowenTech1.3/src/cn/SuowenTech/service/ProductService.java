package cn.SuowenTech.service;

import cn.SuowenTech.po.Product;

public interface ProductService {
	
	public Product findProductById(int product_id);
	
	public int findProduct(int product_id);
}
