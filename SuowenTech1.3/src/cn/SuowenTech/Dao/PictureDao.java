package cn.SuowenTech.Dao;

import java.util.Map;

import cn.SuowenTech.po.Picture;

import com.alibaba.fastjson.JSONObject;

public interface PictureDao {

	//查找所有的图片信息
	public Map<String, Object> findAllPictureInfo();

	//查找图片的URL
	public String findPictureById(int picture_id);

	//上传图片
	public Picture addPicture(String picture_url);

	//删除图片
	public int updatePicture(Map map);
}
