package com.atguigu.gmall.ums.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.ums.entity.MemberLoginLogEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 会员登录记录
 *
 * @author slientFree
 * @email gjqituse@126.com
 * @date 2019-09-21 13:55:18
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageVo queryPage(QueryCondition params);
}

