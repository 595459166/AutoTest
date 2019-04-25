package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("服务端 1");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("服务端 2");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("客户端 3");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("客户端 4");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("服务端组 运行前运行");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("服务端组 运行后运行");
    }










}
