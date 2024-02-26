package com.dao;

import com.entity.ZhibiaoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhibiaoxinxiVO;
import com.entity.view.ZhibiaoxinxiView;


/**
 * 指标信息
 * 
 * @author 
 * @email 
 * @date 2022-03-28 19:33:53
 */
public interface ZhibiaoxinxiDao extends BaseMapper<ZhibiaoxinxiEntity> {
	
	List<ZhibiaoxinxiVO> selectListVO(@Param("ew") Wrapper<ZhibiaoxinxiEntity> wrapper);
	
	ZhibiaoxinxiVO selectVO(@Param("ew") Wrapper<ZhibiaoxinxiEntity> wrapper);
	
	List<ZhibiaoxinxiView> selectListView(@Param("ew") Wrapper<ZhibiaoxinxiEntity> wrapper);

	List<ZhibiaoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhibiaoxinxiEntity> wrapper);
	
	ZhibiaoxinxiView selectView(@Param("ew") Wrapper<ZhibiaoxinxiEntity> wrapper);
	

}
