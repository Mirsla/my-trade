package com.mirsla.trade.service;

import com.alibaba.fastjson.JSON;
import com.mirsla.trade.api.ITestService;
import com.mirsla.trade.business.ConsumersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Mirsla
 * @descripTion:
 * @date: Created in  14:09 2019/3/4
 * @modified By:
 */
@RestController
public class TestServiceImpl implements ITestService {

    @Autowired
    private ConsumersService consumersService;

    @RequestMapping("helloWorld")
    @Override
    public String helloWorld() {
        return JSON.toJSONString(consumersService.getConsumersById(1871606));
    }
}
