package com.demo.bean.common.annotation.circulation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class AnnSelf {

    @Autowired
    private AnnSelf annSelf;

    public AnnSelf getAnnSelf() {
        return annSelf;
    }

    public void setAnnSelf(AnnSelf annSelf) {
        this.annSelf = annSelf;
    }
}
