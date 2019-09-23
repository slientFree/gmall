package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.CouponSpuCategoryRelationEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 优惠券分类关联
 *
 * @author slientFree
 * @email gjqituse@126.com
 * @date 2019-09-21 15:20:42
 */
public interface CouponSpuCategoryRelationService extends IService<CouponSpuCategoryRelationEntity> {

    PageVo queryPage(QueryCondition params);
}

