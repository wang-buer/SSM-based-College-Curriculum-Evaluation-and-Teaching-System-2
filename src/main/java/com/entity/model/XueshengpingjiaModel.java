package com.entity.model;

import com.entity.XueshengpingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 学生评价
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-28 19:33:54
 */
public class XueshengpingjiaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 班级
	 */
	
	private String banji;
		
	/**
	 * 教学能力
	 */
	
	private String jiaoxuenengli;
		
	/**
	 * 教学效果
	 */
	
	private String jiaoxuexiaoguo;
		
	/**
	 * 趣味性
	 */
	
	private String quweixing;
		
	/**
	 * 互动性
	 */
	
	private String hudongxing;
		
	/**
	 * 教学评分
	 */
	
	private Integer jiaoxuepingfen;
		
	/**
	 * 教学评级
	 */
	
	private String jiaoxuepingji;
		
	/**
	 * 教学评价
	 */
	
	private String jiaoxuepingjia;
		
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 跨表用户id
	 */
	
	private Long crossuserid;
		
	/**
	 * 跨表主键id
	 */
	
	private Long crossrefid;
				
	
	/**
	 * 设置：班级
	 */
	 
	public void setBanji(String banji) {
		this.banji = banji;
	}
	
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
				
	
	/**
	 * 设置：教学能力
	 */
	 
	public void setJiaoxuenengli(String jiaoxuenengli) {
		this.jiaoxuenengli = jiaoxuenengli;
	}
	
	/**
	 * 获取：教学能力
	 */
	public String getJiaoxuenengli() {
		return jiaoxuenengli;
	}
				
	
	/**
	 * 设置：教学效果
	 */
	 
	public void setJiaoxuexiaoguo(String jiaoxuexiaoguo) {
		this.jiaoxuexiaoguo = jiaoxuexiaoguo;
	}
	
	/**
	 * 获取：教学效果
	 */
	public String getJiaoxuexiaoguo() {
		return jiaoxuexiaoguo;
	}
				
	
	/**
	 * 设置：趣味性
	 */
	 
	public void setQuweixing(String quweixing) {
		this.quweixing = quweixing;
	}
	
	/**
	 * 获取：趣味性
	 */
	public String getQuweixing() {
		return quweixing;
	}
				
	
	/**
	 * 设置：互动性
	 */
	 
	public void setHudongxing(String hudongxing) {
		this.hudongxing = hudongxing;
	}
	
	/**
	 * 获取：互动性
	 */
	public String getHudongxing() {
		return hudongxing;
	}
				
	
	/**
	 * 设置：教学评分
	 */
	 
	public void setJiaoxuepingfen(Integer jiaoxuepingfen) {
		this.jiaoxuepingfen = jiaoxuepingfen;
	}
	
	/**
	 * 获取：教学评分
	 */
	public Integer getJiaoxuepingfen() {
		return jiaoxuepingfen;
	}
				
	
	/**
	 * 设置：教学评级
	 */
	 
	public void setJiaoxuepingji(String jiaoxuepingji) {
		this.jiaoxuepingji = jiaoxuepingji;
	}
	
	/**
	 * 获取：教学评级
	 */
	public String getJiaoxuepingji() {
		return jiaoxuepingji;
	}
				
	
	/**
	 * 设置：教学评价
	 */
	 
	public void setJiaoxuepingjia(String jiaoxuepingjia) {
		this.jiaoxuepingjia = jiaoxuepingjia;
	}
	
	/**
	 * 获取：教学评价
	 */
	public String getJiaoxuepingjia() {
		return jiaoxuepingjia;
	}
				
	
	/**
	 * 设置：教师工号
	 */
	 
	public void setJiaoshigonghao(String jiaoshigonghao) {
		this.jiaoshigonghao = jiaoshigonghao;
	}
	
	/**
	 * 获取：教师工号
	 */
	public String getJiaoshigonghao() {
		return jiaoshigonghao;
	}
				
	
	/**
	 * 设置：学号
	 */
	 
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：跨表用户id
	 */
	 
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
				
	
	/**
	 * 设置：跨表主键id
	 */
	 
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}
			
}
