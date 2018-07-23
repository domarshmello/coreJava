package com.marshmello.强制转换;


import static java.lang.Integer.valueOf;

/**
 * 数据转换 与强制转换
 * Created by apple on 2018/6/22.
 */
public class data {
    public static  void  main(String[] agrs){
        System.out.println("byte最小值 "+Byte.MIN_VALUE+"byte最大值 "+ Byte.MAX_VALUE);
        System.out.println("char的取值范围" + valueOf(Character.MIN_VALUE) +"max:" +valueOf(Character.MAX_VALUE));
        /* 数据的取值范围？
     byte [-128,127]  数据溢出
         * */
        byte b=127;
        b+=1;

        System.out.println("b="+ b);
        /*数据强制转换
        * **/
        int e =129;
        byte f=(byte)e;
        System.out.print("f=" + f);

    }
}
