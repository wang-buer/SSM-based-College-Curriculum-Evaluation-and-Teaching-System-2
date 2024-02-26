package com.entity.view;

import com.entity.ZhuanjiapingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 专家评价
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-28 19:33:54
 */
@TableName("zhuanjiapingjia")
public class ZhuanjiapingjiaView  extends ZhuanjiapingjiaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhuanjiapingjiaView(){
	}
 
 	public ZhuanjiapingjiaView(ZhuanjiapingjiaEntity zhuanjiapingjiaEntity){
 	try {
			BeanUtils.copyProperties(this, zhuanjiapingjiaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
