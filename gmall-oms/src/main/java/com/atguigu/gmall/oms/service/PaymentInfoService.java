package com.atguigu.gmall.oms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.oms.entity.PaymentInfoEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 支付信息表
 *
 * @author slientFree
 * @email gjqituse@126.com
 * @date 2019-09-21 13:04:43
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

