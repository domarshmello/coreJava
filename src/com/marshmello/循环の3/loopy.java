package com.marshmello.循环の3;
/**
 * while（循环次数不确定）  do-while(先执行一次循环) for（循环次数已知）
 * */
public class loopy {
    public static void main(String[] args) {

        System.out.println("test while loopy");
        int x=1;
        int sum=0;
        while (x <=100){
            sum=sum+x;
            x++;//x=x+1;
        }
        System.out.println("the sum is "+ sum);

   }
}
