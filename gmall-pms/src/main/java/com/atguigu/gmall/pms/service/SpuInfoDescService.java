package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.SpuInfoDescEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * spu信息介绍
 *
 * @author slientFree
 * @email gjqituse@126.com
 * @date 2019-09-21 15:08:30
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageVo queryPage(QueryCondition params);
}

