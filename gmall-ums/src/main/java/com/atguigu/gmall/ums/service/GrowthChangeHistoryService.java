package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.ums.entity.GrowthChangeHistoryEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 成长值变化历史记录
 *
 * @author slientFree
 * @email gjqituse@126.com
 * @date 2019-09-21 13:55:18
 */
public interface GrowthChangeHistoryService extends IService<GrowthChangeHistoryEntity> {

    PageVo queryPage(QueryCondition params);
}

