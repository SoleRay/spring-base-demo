package com.demo.service.demo.impl;

import com.demo.dao.demo.DemoDao;
import com.demo.entity.demo.Demo;
import com.demo.service.base.impl.BaseServiceImpl;
import com.demo.service.demo.DemoService;
import com.demo.service.demo.OtherService;
import com.demo.service.demo.SecondDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

@Service
public class SecondDemoServiceImpl extends BaseServiceImpl<Demo> implements SecondDemoService {

    @Autowired
    private DemoDao demoDao;

    @Transactional
    @Override
    public void add(Demo demo) {
        try{
            demoDao.insert(demo);
            int x = 1/0;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
