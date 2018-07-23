package com.marshmello.数组;

/**
 * 对象数组的 1创建 2引用
 * */
public class Bear {

   private String name;

    public static void main(String[] args) {
        Bear[] bears=new Bear[6];//声明创建大小为6的 赋值给 一个Bear对象类型的 数组变量 bears
        for(int i=0;i<bears.length;i++){

            bears[i]=new Bear();//实例化6个bear
            bears[i].name=i+"喵";
            bears[i].smile();
        }

    }
    public void smile(){
        System.out.println(name +" is smiling");
    }
}
