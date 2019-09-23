package com.atguigu.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.oms.entity.OrderEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 订单
 *
 * @author slientFree
 * @email gjqituse@126.com
 * @date 2019-09-21 13:04:43
 */
public interface OrderService extends IService<OrderEntity> {

    PageVo queryPage(QueryCondition params);
}

