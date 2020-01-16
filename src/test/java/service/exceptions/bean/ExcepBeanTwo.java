package service.exceptions.bean;

public class ExcepBeanTwo {


    public void doMethod(){
        try{
            int x = 1/0;
            System.out.println("ExcepBeanTwo doMethod end1...");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("ExcepBeanTwo doMethod end2...");
    }
}
