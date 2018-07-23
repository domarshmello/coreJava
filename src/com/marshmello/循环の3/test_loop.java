package com.marshmello.循环の3;

public class test_loop {
    public static void main(String[] args) {

        int x=0;

        System.out.println("for循环是知道重复执行的次数---普通版本");
        System.out.println("第一段计数器：int i =0 "+" 第二段条件判断测试条件boolean类型(表达式或者函数)： 返回值为真 一直执行" +" 第三段：设置循环体运行后的表达式或者函数调用： 表达式i++（step为1）");
        for(int i=0;i<5;i++){
            System.out.println(i);
        }

        System.out.println("for循环是知道重复执行的次数---高级加强版本方便操作集合数组对象");
        String[] names={"旺财1","旺财2","旺财3","旺财4"};
        for(String i: names){
            System.out.println(i);

        }

        System.out.println("while循环是不知道重复执行的次数---普通版本");

        while (x<3){
            System.out.println(x);
            x++;
        }

    }
}
