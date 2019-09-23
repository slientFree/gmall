package com.atguigu.gmall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gmall.pms.entity.ProductAttrValueEntity;
import com.atguigu.core.bean.PageVo;
import com.atguigu.core.bean.QueryCondition;


/**
 * spu属性值
 *
 * @author slientFree
 * @email gjqituse@126.com
 * @date 2019-09-21 15:08:29
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageVo queryPage(QueryCondition params);
}

