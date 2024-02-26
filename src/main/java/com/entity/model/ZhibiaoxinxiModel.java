package com.entity.model;

import com.entity.ZhibiaoxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 指标信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-28 19:33:53
 */
public class ZhibiaoxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 指标名称
	 */
	
	private String zhibiaomingcheng;
		
	/**
	 * 指标权重
	 */
	
	private String zhibiaoquanzhong;
		
	/**
	 * 指标内容
	 */
	
	private String zhibiaoneirong;
				
	
	/**
	 * 设置：指标名称
	 */
	 
	public void setZhibiaomingcheng(String zhibiaomingcheng) {
		this.zhibiaomingcheng = zhibiaomingcheng;
	}
	
	/**
	 * 获取：指标名称
	 */
	public String getZhibiaomingcheng() {
		return zhibiaomingcheng;
	}
				
	
	/**
	 * 设置：指标权重
	 */
	 
	public void setZhibiaoquanzhong(String zhibiaoquanzhong) {
		this.zhibiaoquanzhong = zhibiaoquanzhong;
	}
	
	/**
	 * 获取：指标权重
	 */
	public String getZhibiaoquanzhong() {
		return zhibiaoquanzhong;
	}
				
	
	/**
	 * 设置：指标内容
	 */
	 
	public void setZhibiaoneirong(String zhibiaoneirong) {
		this.zhibiaoneirong = zhibiaoneirong;
	}
	
	/**
	 * 获取：指标内容
	 */
	public String getZhibiaoneirong() {
		return zhibiaoneirong;
	}
			
}
