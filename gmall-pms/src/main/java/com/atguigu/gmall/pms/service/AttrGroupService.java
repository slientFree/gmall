package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.AttrGroupEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 属性分组
 *
 * @author slientFree
 * @email gjqituse@126.com
 * @date 2019-09-21 15:08:30
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageVo queryPage(QueryCondition params);
}

