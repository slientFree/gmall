package com.atguigu.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.wms.entity.WareOrderTaskEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 库存工作单
 *
 * @author slientFree
 * @email gjqituse@126.com
 * @date 2019-09-21 14:00:11
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageVo queryPage(QueryCondition params);
}

