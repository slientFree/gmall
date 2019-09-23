package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author slientFree
 * @email gjqituse@126.com
 * @date 2019-09-21 15:20:42
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
