package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author yufei
 * @email chrisfyu@hotmail.com
 * @date 2023-07-17 19:24:27
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
