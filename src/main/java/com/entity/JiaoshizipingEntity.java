package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 教师自评
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-28 19:33:54
 */
@TableName("jiaoshiziping")
public class JiaoshizipingEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaoshizipingEntity() {
		
	}
	
	public JiaoshizipingEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 课程
	 */
					
	private String kecheng;
	
	/**
	 * 趣味性
	 */
					
	private String quweixing;
	
	/**
	 * 互动性
	 */
					
	private String hudongxing;
	
	/**
	 * 课程评分
	 */
					
	private Integer kechengpingfen;
	
	/**
	 * 总体评价
	 */
					
	private String zongtipingjia;
	
	/**
	 * 评价内容
	 */
					
	private String pingjianeirong;
	
	/**
	 * 评价日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date pingjiariqi;
	
	/**
	 * 教师工号
	 */
					
	private String jiaoshigonghao;
	
	/**
	 * 跨表用户id
	 */
					
	private Long crossuserid;
	
	/**
	 * 跨表主键id
	 */
					
	private Long crossrefid;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：课程
	 */
	public void setKecheng(String kecheng) {
		this.kecheng = kecheng;
	}
	/**
	 * 获取：课程
	 */
	public String getKecheng() {
		return kecheng;
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
	 * 设置：课程评分
	 */
	public void setKechengpingfen(Integer kechengpingfen) {
		this.kechengpingfen = kechengpingfen;
	}
	/**
	 * 获取：课程评分
	 */
	public Integer getKechengpingfen() {
		return kechengpingfen;
	}
	/**
	 * 设置：总体评价
	 */
	public void setZongtipingjia(String zongtipingjia) {
		this.zongtipingjia = zongtipingjia;
	}
	/**
	 * 获取：总体评价
	 */
	public String getZongtipingjia() {
		return zongtipingjia;
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
