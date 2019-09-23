package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.SkuInfoEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * sku信息
 *
 * @author slientFree
 * @email gjqituse@126.com
 * @date 2019-09-21 15:08:29
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

