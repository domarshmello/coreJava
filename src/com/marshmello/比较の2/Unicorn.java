package com.marshmello.比较の2;

import com.sun.org.apache.xpath.internal.operations.Equals;

/**
 * api:练习equals()方法 比较的是两个对象在实际意义上是否相等（是否属于同类）
 * */
public class Unicorn {

public static void main(String[] args) {
    Unicorn unicorn_a= new Unicorn();//unicorn_a存储 new Unicorn() 在堆的 地址
    Unicorn unicorn_b= new Unicorn();//unicorn_b存储 new Unicorn() 在堆的 地址
    if(unicorn_a.equals(unicorn_b)){
        System.out.println("unicorn_a 和 unicorn_b 地址是相同的 ");
    }else {
        System.out.println("unicorn_a 和 unicorn_b 地址不是相同的 ");
    }
}

}
