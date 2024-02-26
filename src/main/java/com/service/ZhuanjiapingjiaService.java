package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuanjiapingjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuanjiapingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuanjiapingjiaView;


/**
 * 专家评价
 *
 * @author 
 * @email 
 * @date 2022-03-28 19:33:54
 */
public interface ZhuanjiapingjiaService extends IService<ZhuanjiapingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuanjiapingjiaVO> selectListVO(Wrapper<ZhuanjiapingjiaEntity> wrapper);
   	
   	ZhuanjiapingjiaVO selectVO(@Param("ew") Wrapper<ZhuanjiapingjiaEntity> wrapper);
   	
   	List<ZhuanjiapingjiaView> selectListView(Wrapper<ZhuanjiapingjiaEntity> wrapper);
   	
   	ZhuanjiapingjiaView selectView(@Param("ew") Wrapper<ZhuanjiapingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuanjiapingjiaEntity> wrapper);
   	

}

