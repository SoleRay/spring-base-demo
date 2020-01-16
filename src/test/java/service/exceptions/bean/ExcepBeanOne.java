package service.exceptions.bean;

public class ExcepBeanOne {

    private ExcepBeanTwo excepBeanTwo;

    public void doMethod(){

        try{
            System.out.println("ExcepBeanOne doMethod start");
            excepBeanTwo.doMethod();
            System.out.println("ExcepBeanOne doMethod end...");
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("ExcepBeanOne finally");
        }

    }

    public ExcepBeanTwo getExcepBeanTwo() {
        return excepBeanTwo;
    }

    public void setExcepBeanTwo(ExcepBeanTwo excepBeanTwo) {
        this.excepBeanTwo = excepBeanTwo;
    }
}
