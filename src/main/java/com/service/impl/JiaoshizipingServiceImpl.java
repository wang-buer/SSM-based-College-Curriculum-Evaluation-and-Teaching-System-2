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


import com.dao.JiaoshizipingDao;
import com.entity.JiaoshizipingEntity;
import com.service.JiaoshizipingService;
import com.entity.vo.JiaoshizipingVO;
import com.entity.view.JiaoshizipingView;

@Service("jiaoshizipingService")
public class JiaoshizipingServiceImpl extends ServiceImpl<JiaoshizipingDao, JiaoshizipingEntity> implements JiaoshizipingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoshizipingEntity> page = this.selectPage(
                new Query<JiaoshizipingEntity>(params).getPage(),
                new EntityWrapper<JiaoshizipingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoshizipingEntity> wrapper) {
		  Page<JiaoshizipingView> page =new Query<JiaoshizipingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoshizipingVO> selectListVO(Wrapper<JiaoshizipingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoshizipingVO selectVO(Wrapper<JiaoshizipingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoshizipingView> selectListView(Wrapper<JiaoshizipingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoshizipingView selectView(Wrapper<JiaoshizipingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
