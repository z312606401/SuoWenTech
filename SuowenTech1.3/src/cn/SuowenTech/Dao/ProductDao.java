package cn.SuowenTech.Dao;

import cn.SuowenTech.po.Product;

public interface ProductDao {

	//通过Id查询某一产品信息
		public Product findProductById(int product_id);
	
	//查看图片是否存在
		public int findProduct(int product_id);
		
}
