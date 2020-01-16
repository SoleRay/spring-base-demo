package service.exceptions;

import service.exceptions.bean.ExcepBeanOne;
import service.exceptions.bean.ExcepBeanTwo;

public class TestException {

    public static void main(String[] args) {
        ExcepBeanOne excepBeanOne = new ExcepBeanOne();
        excepBeanOne.setExcepBeanTwo(new ExcepBeanTwo());
        excepBeanOne.doMethod();
    }
}
