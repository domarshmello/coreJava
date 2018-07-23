package com.marshmello.String;



/**
 * 学习core_java之 String
 * String  extends from CharSequence
 * Created by apple on 2018/6/21.
 */
public class string {
    public static void main(String [] args){
        String s ="abcd";
        s = s.concat("ef");
        System.out.println("concat方法连接在字符串后面加" + s);
            test1();

    }
    /**
     * 采用字面值的方式赋值
     */
    private static void test1(){
        String str1="aaa";
        String str2="aaa";
        System.out.println("===========test1============");
        System.out.println(str1==str2);//true 可以看出str1跟str2是指向同一个对象
    }



}
