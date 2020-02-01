package com.demo.dto.request.demo;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

public class DemoReqDTO {

    private long id;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate createDate;

    private BoxBean boxBean;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public BoxBean getBoxBean() {
        return boxBean;
    }

    public void setBoxBean(BoxBean boxBean) {
        this.boxBean = boxBean;
    }


}
