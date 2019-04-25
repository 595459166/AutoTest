package com.course.testng;

import org.testng.annotations.Test;

public class IngoreTest {

    @Test
    public void ingore1(){
        System.out.println("ignore1 执行");
    }

    // 不执行
    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2 执行");
    }
}
