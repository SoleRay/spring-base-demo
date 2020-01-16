package service;


import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

public class TestGeneric {

//    public static void main(String[] args) {
//        Field[] fields = AnnBeanPropAutowire.class.getDeclaredFields();
//
//
//        List<Type> typeList = new ArrayList<>();
//        for(Field field : fields){
//
//            boolean flag = false;
//            Type genericType = field.getGenericType();
//            if(ParameterizedType.class.isInstance(genericType)){
//                ParameterizedType castType = ParameterizedType.class.cast(genericType);
//                flag = collectRealType(typeList,castType.getActualTypeArguments());
//            }
//
//            if(!flag){
//                typeList.add(genericType);
//            }
////            if(field.getName().equals("annList")){
////                Type genericType = field.getGenericType();
////                ParameterizedType p = (ParameterizedType)genericType;
////                Type t = p.getActualTypeArguments()[0];
////                System.out.println(t);
////            }
//        }
//
//        System.out.println("box");
//    }

    private static boolean collectRealType(List<Type> typeList, Type[] actualTypeArguments) {

        boolean flag = false;
        for(Type type : actualTypeArguments){
            if(WildcardType.class.isInstance(type) || GenericArrayType.class.isInstance(type)){
                typeList.add(type);
                flag =true;
            }
        }
        return flag;
    }
}
