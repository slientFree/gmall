package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author slientFree
 * @email gjqituse@126.com
 * @date 2019-09-21 15:08:29
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
