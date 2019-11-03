package com.demo.service.demo;

import com.demo.entity.demo.Demo;
import com.demo.service.base.BaseService;

public interface DemoService extends BaseService<Demo> {

    void add(Demo demo);

    void addWithNewTrans(Demo demo);

    void addWithNESTED(Demo demo);

    void change(Demo demo);
}
