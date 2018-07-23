package com.marshmello.数据转换;

public class test_primitive {

    public static void main(String[] args) {
        long x=42;
        System.out.println("long类型（范围大）赋值给short类型（范围小）需要强制转换成小类型");
        short y= (short) x;
        System.out.println("long类型x 转换 int 类型 之后的值是 "+y);

        System.out.println("------------------------------------");
        float f= 1.234f;
        int f1= (int) f;
        System.out.println("  float类型f 转换 int 类型 之后的值是 "+f1);
    }
}
