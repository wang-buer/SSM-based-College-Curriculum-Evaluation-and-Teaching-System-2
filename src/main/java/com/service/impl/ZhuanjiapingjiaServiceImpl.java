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


import com.dao.ZhuanjiapingjiaDao;
import com.entity.ZhuanjiapingjiaEntity;
import com.service.ZhuanjiapingjiaService;
import com.entity.vo.ZhuanjiapingjiaVO;
import com.entity.view.ZhuanjiapingjiaView;

@Service("zhuanjiapingjiaService")
public class ZhuanjiapingjiaServiceImpl extends ServiceImpl<ZhuanjiapingjiaDao, ZhuanjiapingjiaEntity> implements ZhuanjiapingjiaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuanjiapingjiaEntity> page = this.selectPage(
                new Query<ZhuanjiapingjiaEntity>(params).getPage(),
                new EntityWrapper<ZhuanjiapingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuanjiapingjiaEntity> wrapper) {
		  Page<ZhuanjiapingjiaView> page =new Query<ZhuanjiapingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuanjiapingjiaVO> selectListVO(Wrapper<ZhuanjiapingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuanjiapingjiaVO selectVO(Wrapper<ZhuanjiapingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuanjiapingjiaView> selectListView(Wrapper<ZhuanjiapingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuanjiapingjiaView selectView(Wrapper<ZhuanjiapingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
