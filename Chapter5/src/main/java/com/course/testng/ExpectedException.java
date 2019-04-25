package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {

    //失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("失败的异常测试");
    }

    //正常的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("正常的异常测试");
        throw new RuntimeException();  //必须放在后面
    }
}
