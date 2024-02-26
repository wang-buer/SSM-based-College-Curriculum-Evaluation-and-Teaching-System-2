package com.entity.model;

import com.entity.ZhuanjiapingjiaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 专家评价
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-28 19:33:54
 */
public class ZhuanjiapingjiaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 教学能力
	 */
	
	private String jiaoxuenengli;
		
	/**
	 * 教学效果
	 */
	
	private String jiaoxuexiaoguo;
		
	/**
	 * 学生状态
	 */
	
	private String xueshengzhuangtai;
		
	/**
	 * 教学评分
	 */
	
	private Integer jiaoxuepingfen;
		
	/**
	 * 教学评级
	 */
	
	private String jiaoxuepingji;
		
	/**
	 * 评价内容
	 */
	
	private String pingjianeirong;
		
	/**
	 * 教师工号
	 */
	
	private String jiaoshigonghao;
		
	/**
	 * 教师姓名
	 */
	
	private String jiaoshixingming;
		
	/**
	 * 评价日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date pingjiariqi;
		
	/**
	 * 专家账号
	 */
	
	private String zhuanjiazhanghao;
		
	/**
	 * 专家姓名
	 */
	
	private String zhuanjiaxingming;
		
	/**
	 * 跨表用户id
	 */
	
	private Long crossuserid;
		
	/**
	 * 跨表主键id
	 */
	
	private Long crossrefid;
				
	
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
	 * 设置：学生状态
	 */
	 
	public void setXueshengzhuangtai(String xueshengzhuangtai) {
		this.xueshengzhuangtai = xueshengzhuangtai;
	}
	
	/**
	 * 获取：学生状态
	 */
	public String getXueshengzhuangtai() {
		return xueshengzhuangtai;
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
	 * 设置：评价内容
	 */
	 
	public void setPingjianeirong(String pingjianeirong) {
		this.pingjianeirong = pingjianeirong;
	}
	
	/**
	 * 获取：评价内容
	 */
	public String getPingjianeirong() {
		return pingjianeirong;
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
	 * 设置：教师姓名
	 */
	 
	public void setJiaoshixingming(String jiaoshixingming) {
		this.jiaoshixingming = jiaoshixingming;
	}
	
	/**
	 * 获取：教师姓名
	 */
	public String getJiaoshixingming() {
		return jiaoshixingming;
	}
				
	
	/**
	 * 设置：评价日期
	 */
	 
	public void setPingjiariqi(Date pingjiariqi) {
		this.pingjiariqi = pingjiariqi;
	}
	
	/**
	 * 获取：评价日期
	 */
	public Date getPingjiariqi() {
		return pingjiariqi;
	}
				
	
	/**
	 * 设置：专家账号
	 */
	 
	public void setZhuanjiazhanghao(String zhuanjiazhanghao) {
		this.zhuanjiazhanghao = zhuanjiazhanghao;
	}
	
	/**
	 * 获取：专家账号
	 */
	public String getZhuanjiazhanghao() {
		return zhuanjiazhanghao;
	}
				
	
	/**
	 * 设置：专家姓名
	 */
	 
	public void setZhuanjiaxingming(String zhuanjiaxingming) {
		this.zhuanjiaxingming = zhuanjiaxingming;
	}
	
	/**
	 * 获取：专家姓名
	 */
	public String getZhuanjiaxingming() {
		return zhuanjiaxingming;
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
