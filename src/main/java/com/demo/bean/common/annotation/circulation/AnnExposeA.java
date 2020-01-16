package com.demo.bean.common.annotation.circulation;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Lazy
public class AnnExposeA implements InitializingBean{

    @Autowired
    private AnnExposeB annExposeB;

    private List<String> stringList;

    @Override
    public void afterPropertiesSet() throws Exception {
        stringList = new ArrayList<>();
    }

    public void execute(){
//        stringList.add("aaa");
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public AnnExposeB getAnnExposeB() {
        return annExposeB;
    }

    public void setAnnExposeB(AnnExposeB annExposeB) {
        this.annExposeB = annExposeB;
    }
}
