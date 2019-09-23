package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.BrandEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 品牌
 *
 * @author slientFree
 * @email gjqituse@126.com
 * @date 2019-09-21 15:08:30
 */
public interface BrandService extends IService<BrandEntity> {

    PageVo queryPage(QueryCondition params);
}

