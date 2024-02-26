package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ZhuanjiapingjiaEntity;
import com.entity.view.ZhuanjiapingjiaView;

import com.service.ZhuanjiapingjiaService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 专家评价
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-28 19:33:54
 */
@RestController
@RequestMapping("/zhuanjiapingjia")
public class ZhuanjiapingjiaController {
    @Autowired
    private ZhuanjiapingjiaService zhuanjiapingjiaService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ZhuanjiapingjiaEntity zhuanjiapingjia, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			zhuanjiapingjia.setJiaoshigonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("zhuanjia")) {
			zhuanjiapingjia.setZhuanjiazhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ZhuanjiapingjiaEntity> ew = new EntityWrapper<ZhuanjiapingjiaEntity>();
		PageUtils page = zhuanjiapingjiaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhuanjiapingjia), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ZhuanjiapingjiaEntity zhuanjiapingjia, 
		HttpServletRequest request){
        EntityWrapper<ZhuanjiapingjiaEntity> ew = new EntityWrapper<ZhuanjiapingjiaEntity>();
		PageUtils page = zhuanjiapingjiaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, zhuanjiapingjia), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ZhuanjiapingjiaEntity zhuanjiapingjia){
       	EntityWrapper<ZhuanjiapingjiaEntity> ew = new EntityWrapper<ZhuanjiapingjiaEntity>();
      	ew.allEq(MPUtil.allEQMapPre( zhuanjiapingjia, "zhuanjiapingjia")); 
        return R.ok().put("data", zhuanjiapingjiaService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ZhuanjiapingjiaEntity zhuanjiapingjia){
        EntityWrapper< ZhuanjiapingjiaEntity> ew = new EntityWrapper< ZhuanjiapingjiaEntity>();
 		ew.allEq(MPUtil.allEQMapPre( zhuanjiapingjia, "zhuanjiapingjia")); 
		ZhuanjiapingjiaView zhuanjiapingjiaView =  zhuanjiapingjiaService.selectView(ew);
		return R.ok("查询专家评价成功").put("data", zhuanjiapingjiaView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ZhuanjiapingjiaEntity zhuanjiapingjia = zhuanjiapingjiaService.selectById(id);
        return R.ok().put("data", zhuanjiapingjia);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ZhuanjiapingjiaEntity zhuanjiapingjia = zhuanjiapingjiaService.selectById(id);
        return R.ok().put("data", zhuanjiapingjia);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ZhuanjiapingjiaEntity zhuanjiapingjia, HttpServletRequest request){
    	zhuanjiapingjia.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhuanjiapingjia);

        zhuanjiapingjiaService.insert(zhuanjiapingjia);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ZhuanjiapingjiaEntity zhuanjiapingjia, HttpServletRequest request){
    	zhuanjiapingjia.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(zhuanjiapingjia);

        zhuanjiapingjiaService.insert(zhuanjiapingjia);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody ZhuanjiapingjiaEntity zhuanjiapingjia, HttpServletRequest request){
        //ValidatorUtils.validateEntity(zhuanjiapingjia);
        zhuanjiapingjiaService.updateById(zhuanjiapingjia);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        zhuanjiapingjiaService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<ZhuanjiapingjiaEntity> wrapper = new EntityWrapper<ZhuanjiapingjiaEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			wrapper.eq("jiaoshigonghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("zhuanjia")) {
			wrapper.eq("zhuanjiazhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = zhuanjiapingjiaService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
