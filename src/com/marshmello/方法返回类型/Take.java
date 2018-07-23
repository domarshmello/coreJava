package com.marshmello.方法返回类型;

public class Take {
    void takeTwo(int x,int y){
        int z=x+y;
        System.out.println("Total value is "+ z);
    }

    void go(){
        int m=12;
        int n=34;
        takeTwo(m,n);// m-->x  n-->y 类型必须保持一致int
    }

    public static void main(String[] args) {
        Take demo=new Take();
        demo.go();
    }
}
