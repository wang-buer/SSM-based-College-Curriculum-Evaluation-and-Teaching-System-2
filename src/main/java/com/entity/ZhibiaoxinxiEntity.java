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
 * 指标信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-28 19:33:53
 */
@TableName("zhibiaoxinxi")
public class ZhibiaoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ZhibiaoxinxiEntity() {
		
	}
	
	public ZhibiaoxinxiEntity(T t) {
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
	 * 指标号
	 */
					
	private String zhibiaohao;
	
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
	 * 设置：指标号
	 */
	public void setZhibiaohao(String zhibiaohao) {
		this.zhibiaohao = zhibiaohao;
	}
	/**
	 * 获取：指标号
	 */
	public String getZhibiaohao() {
		return zhibiaohao;
	}
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
