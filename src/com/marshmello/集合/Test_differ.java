package com.marshmello.集合;

import java.util.ArrayList;

/**
 *  ArrayList与数组的区别
 * */
public class Test_differ {

    public static void main(String[] args) {

        String[] a=new String[2];//数组需要声明大小
        ArrayList<String> al=new ArrayList<String>();//不需要指定大小,只能存放String类型的数据
        a[0]="hello world"; //通过数组下标赋值
        al.add("hello world");
        al.add(9,"hello world");


    }
}
