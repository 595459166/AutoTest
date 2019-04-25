package com.course.testng;

import org.testng.annotations.*;

import java.awt.*;

public class BasicAnnotation {

    //最基本的注解，用来把方法标记为测试的一部分
    @Test
    public void testCase1(){
        System.out.println("testCase1这是测试用例1");
    }

    @Test
    public void testCase2(){
        System.out.println("testCase2这是测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforemethod在测试之前运行");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod在测试之后运行");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass是在类运行之前运行的方法");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass是在类运行之后运行的方法");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforesuite");
    }

    @AfterSuite
    public void afterSuiter(){
        System.out.println("aftersuite");
    }

}
