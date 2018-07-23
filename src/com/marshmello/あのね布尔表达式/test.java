package com.marshmello.あのね布尔表达式;

/**
 * && || !
 * >= ==
 *
 * */
public class test {
    public static void main(String[] args) {
        int a=10;
        int b=5;
        int c=7;
        boolean e=true;


        if (a>=b){
            System.out.println("a 比 b 小");
        }
        if(c >= b && c<=a){
            System.out.println("c 在a 和 b 之间 ");
        }

        if(a>=10 || b>=10){
            System.out.println("a 和 b 中有一个比10 大");
        }
        if(e){
            System.out.println(e);
        }
    }
}
