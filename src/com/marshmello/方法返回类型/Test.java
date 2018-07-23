package com.marshmello.方法返回类型;

public class Test {
    int giveNum(){
        return 18;
    }
    public static void main(String[] args) {

        Test test=new Test();

        int x=0;
        System.out.println("赋值之前的x的值是 "+ x);

        x=test.giveNum();
        System.out.println("赋值之后的x的值是 "+ x);


    }

}
