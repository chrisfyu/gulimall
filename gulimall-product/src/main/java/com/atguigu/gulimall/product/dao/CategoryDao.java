package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yufei
 * @email chrisfyu@hotmail.com
 * @date 2023-07-09 20:06:58
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
