package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhibiaoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhibiaoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhibiaoxinxiView;


/**
 * 指标信息
 *
 * @author 
 * @email 
 * @date 2022-03-28 19:33:53
 */
public interface ZhibiaoxinxiService extends IService<ZhibiaoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhibiaoxinxiVO> selectListVO(Wrapper<ZhibiaoxinxiEntity> wrapper);
   	
   	ZhibiaoxinxiVO selectVO(@Param("ew") Wrapper<ZhibiaoxinxiEntity> wrapper);
   	
   	List<ZhibiaoxinxiView> selectListView(Wrapper<ZhibiaoxinxiEntity> wrapper);
   	
   	ZhibiaoxinxiView selectView(@Param("ew") Wrapper<ZhibiaoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhibiaoxinxiEntity> wrapper);
   	

}

