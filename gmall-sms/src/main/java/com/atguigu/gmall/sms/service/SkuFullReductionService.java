package com.atguigu.gmall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.sms.entity.SkuFullReductionEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 商品满减信息
 *
 * @author slientFree
 * @email gjqituse@126.com
 * @date 2019-09-21 15:20:42
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageVo queryPage(QueryCondition params);
}

