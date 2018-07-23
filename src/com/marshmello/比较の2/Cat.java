package com.marshmello.比较の2;
/**
 * "=="比"equals"运行速度快,因为"=="只是比较引用(引用在栈里)。
 * 对于引用型变量表示的是两个变量在堆中存储的地址是否相同，即栈中的内容是否相同  ==
 * */
public class Cat {
    private  String name;
    private Cat(String name){
        this.name=name;
    }
    public static void main(String[] args) {
        String a = "ab"; // a 为一个引用
        String b = "ab"; // b为另一个引用,对象的内容一样
//引用指向两个不同的对象 不同的对象的内容相同的话 也不等
        Cat cat_a=new Cat("喵喵");
        Cat cat_b=new Cat("喵喵");//equals操作表示的两个引用变量是否是对同一个Cat对象的引用，即堆中的内容是否相同。

        if(cat_a.equals(cat_b)){
            System.out.println("cat_a 和 cat_b 地址是相同的 ");
        }else {
            System.out.println("cat_a 和 cat_b 地址不是相同的 ");
        }

        if (a.equals(b)){// true
            System.out.println("a equals b");
        }


    }
}
