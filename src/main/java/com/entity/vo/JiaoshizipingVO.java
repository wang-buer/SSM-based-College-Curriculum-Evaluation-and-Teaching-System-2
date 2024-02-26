package com.entity.vo;

import com.entity.JiaoshizipingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 教师自评
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-28 19:33:54
 */
public class JiaoshizipingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
