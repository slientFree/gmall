package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.ums.entity.MemberStatisticsInfoEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 会员统计信息
 *
 * @author slientFree
 * @email gjqituse@126.com
 * @date 2019-09-21 13:55:18
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

