package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author slientFree
 * @email gjqituse@126.com
 * @date 2019-09-21 13:55:18
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
