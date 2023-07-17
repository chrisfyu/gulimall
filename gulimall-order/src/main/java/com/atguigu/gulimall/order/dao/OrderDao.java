package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author yufei
 * @email chrisfyu@hotmail.com
 * @date 2023-07-17 19:16:20
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
