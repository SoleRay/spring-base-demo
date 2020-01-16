package com.demo.service.demo.impl;

import com.demo.entity.demo.Demo;
import com.demo.service.base.impl.BaseServiceImpl;
import com.demo.service.demo.DemoService;
import com.demo.service.demo.OtherService;
import com.demo.service.demo.SecondDemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

@Service
public class OtherServiceImpl extends BaseServiceImpl<Demo> implements OtherService {

    @Autowired
    private DemoService demoService;

    @Autowired
    private SecondDemoService secondDemoService;

    @Transactional
    @Override
    public void add(Demo demo) {
        try{
            demoService.add(demo);
            int i = 1/0;
        }catch (Exception e){
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
        }

//        secondDemoService.add(demo);
    }
}
