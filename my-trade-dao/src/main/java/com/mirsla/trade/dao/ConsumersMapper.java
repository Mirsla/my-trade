package com.mirsla.trade.dao;

import com.mirsla.trade.entity.Consumers;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author: Mirsla
 * @descripTion:
 * @date: Created in  15:32 2019/3/4
 * @modified By:
 */
@Mapper
public interface ConsumersMapper {

    Consumers selectByPrimaryKey(@Param("cId") Integer cId);
}
