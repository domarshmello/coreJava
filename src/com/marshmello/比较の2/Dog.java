package com.marshmello.比较の2;
/**
 * author:domarshmello
 * api:练习 == 用法
 * */
public class Dog {

    public static void main(String[] args) {

        int a=3;
        byte b=3;
        if(a==b){//primitive 比较的是字节组合内容
            System.out.println(" a 和  b 相等");
        }
        //class 类型的 比较的是否指向同一个对象
        Dog q =new Dog();
        Dog w=new Dog();
        Dog e=q;
        if(q==w){
            System.out.println(" q 和  w 是指向同一个对象的 ");
        }else{
            System.out.println(" q 和  w 不是指向同一个对象的 ");
        }
        if(q==e){
            System.out.println(" q 和  e 是指向同一个对象的 ");
        }else{
            System.out.println(" q 和  e 不是指向同一个对象的 ");
        }

    }
}
