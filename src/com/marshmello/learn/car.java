package com.marshmello.learn;

/**
 * Created by marshmello on 2018/6/9.
 **/
//设计一个类就是抽象的过程  程序=数据结构+算法

//    Q:为什么要有类？A: 抽象    数据类型  模板
//    Q:为什么要有对象？A:具体的个体  数据  实例
public class car {
//    共同的特征=-提炼为属性；

    int wheelNum;
    String color;
    String brand;

// 共同的行为--提炼为方法runrun
    void start(){
        System.out.print("车的启动方法");
    }
    void run(){
        System.out.print("车的驾驶方法");
    }
    void stop(){
        System.out.print("车的停车方法");
    }

}
