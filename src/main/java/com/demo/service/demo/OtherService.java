package com.demo.service.demo;

import com.demo.entity.demo.Demo;
import com.demo.service.base.BaseService;

public interface OtherService extends BaseService<Demo> {

    void add(Demo demo);
}
