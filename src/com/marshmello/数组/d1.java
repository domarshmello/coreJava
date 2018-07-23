package com.marshmello.数组;
/**
 * 解决数据量大的时候
 * 将数组想象成若干个杯子
 * 访问数组每一个元素 数组的名称+数组编号（偏移量）
 * 内容的时候从编号0开始
 *
 *
 * */
public class d1 {

    public static void main(String[] args) {
        int[] num=new int[6];
        for (int i=0;i<=num.length-1;i++){

            num[i]=i;
           // System.out.println("第 "+ i +"个 dog");
            System.out.println("num [" + i + " ]  : " + num[i]);
        }

    }
    public  void bark(){
        System.out.println("is barking ");
    }
}
