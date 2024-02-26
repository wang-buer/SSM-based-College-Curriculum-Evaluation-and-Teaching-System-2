package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZhibiaoxinxiDao;
import com.entity.ZhibiaoxinxiEntity;
import com.service.ZhibiaoxinxiService;
import com.entity.vo.ZhibiaoxinxiVO;
import com.entity.view.ZhibiaoxinxiView;

@Service("zhibiaoxinxiService")
public class ZhibiaoxinxiServiceImpl extends ServiceImpl<ZhibiaoxinxiDao, ZhibiaoxinxiEntity> implements ZhibiaoxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhibiaoxinxiEntity> page = this.selectPage(
                new Query<ZhibiaoxinxiEntity>(params).getPage(),
                new EntityWrapper<ZhibiaoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhibiaoxinxiEntity> wrapper) {
		  Page<ZhibiaoxinxiView> page =new Query<ZhibiaoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhibiaoxinxiVO> selectListVO(Wrapper<ZhibiaoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhibiaoxinxiVO selectVO(Wrapper<ZhibiaoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhibiaoxinxiView> selectListView(Wrapper<ZhibiaoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhibiaoxinxiView selectView(Wrapper<ZhibiaoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
