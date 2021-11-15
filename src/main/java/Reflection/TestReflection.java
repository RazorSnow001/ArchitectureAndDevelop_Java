package Reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clz = Class.forName("Reflection.Apple");
        Method setMethod = clz.getMethod("setName", String.class);
        Constructor constructor = clz.getConstructor();
        Object object = constructor.newInstance();
        setMethod.invoke(object,"apple");
        Method getPriceMethod = clz.getMethod("getName");
        System.out.println(getPriceMethod.invoke(object));
    }


}
