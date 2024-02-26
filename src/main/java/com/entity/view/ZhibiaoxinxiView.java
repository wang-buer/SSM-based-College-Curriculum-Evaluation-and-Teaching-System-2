package com.entity.view;

import com.entity.ZhibiaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 指标信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-28 19:33:53
 */
@TableName("zhibiaoxinxi")
public class ZhibiaoxinxiView  extends ZhibiaoxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhibiaoxinxiView(){
	}
 
 	public ZhibiaoxinxiView(ZhibiaoxinxiEntity zhibiaoxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, zhibiaoxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
