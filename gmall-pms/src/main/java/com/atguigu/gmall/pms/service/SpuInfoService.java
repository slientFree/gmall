package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.SpuInfoEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * spu信息
 *
 * @author slientFree
 * @email gjqituse@126.com
 * @date 2019-09-21 15:08:30
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

