package com.atguigu.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.oms.entity.OrderReturnApplyEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 订单退货申请
 *
 * @author slientFree
 * @email gjqituse@126.com
 * @date 2019-09-21 13:04:43
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageVo queryPage(QueryCondition params);
}

