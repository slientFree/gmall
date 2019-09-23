package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author slientFree
 * @email gjqituse@126.com
 * @date 2019-09-21 13:04:43
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
