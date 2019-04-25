package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age){
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }

    @DataProvider(name="data")
    public Object[][] providerData(){
        Object[][] obj = new Object[][]{ {"zhangsan",10}, {"lisi",20}, {"wangwu",30} };
        return obj;
    }


    @Test(dataProvider = "methodData")
    public void test1(String name, int age){
        System.out.println("test1");
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name, int age){
        System.out.println("test2");
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }

    @DataProvider(name="methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result = null;

        if(method.getName().equals("test1")){
            result = new Object[][]{ {"zhangsan",10}, {"lisi",20} };
        }
        else if(method.getName().equals("test2")){
            result = new Object[][]{ {"wangwu",30} };
        }
        return result;
    }

}
