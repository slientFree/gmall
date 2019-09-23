package com.atguigu.gmall.wms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.wms.entity.WareInfoEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * 仓库信息
 *
 * @author slientFree
 * @email gjqituse@126.com
 * @date 2019-09-21 14:00:11
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageVo queryPage(QueryCondition params);
}

