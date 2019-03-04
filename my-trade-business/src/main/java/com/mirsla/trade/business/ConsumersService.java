package com.mirsla.trade.business;

import com.mirsla.trade.dao.ConsumersMapper;
import com.mirsla.trade.entity.Consumers;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: Mirsla
 * @descripTion:
 * @date: Created in  16:10 2019/3/4
 * @modified By:
 */
@Service
public class ConsumersService {

    @Resource
    private ConsumersMapper consumersMapper;

    public Consumers getConsumersById(Integer cId) {
        return consumersMapper.selectByPrimaryKey(cId);
    }
}
