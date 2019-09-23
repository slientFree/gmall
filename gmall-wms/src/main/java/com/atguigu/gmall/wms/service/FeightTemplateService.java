package com.atguigu.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.wms.entity.FeightTemplateEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 运费模板
 *
 * @author slientFree
 * @email gjqituse@126.com
 * @date 2019-09-21 14:00:11
 */
public interface FeightTemplateService extends IService<FeightTemplateEntity> {

    PageVo queryPage(QueryCondition params);
}

