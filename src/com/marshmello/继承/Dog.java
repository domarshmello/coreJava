package com.marshmello.继承;

/**
 * class : 属性 方法 （具体方法的实现）
 * interface : 定义一个实现某功能的抽象方法 但是没有具体实现
 * ps:出现代码冗余的话 抽象一个顶层的类 比如狗and鳄鱼同属于动物 都有腿and眼睛
 * 子类会继承父类所有的public and protected类型的实例变量和方法 ，不会继承父类中private类型的变量和方法
 * */
public class Dog extends Animal{

    public void info() {
        System.out.println(" have "+ eyes +" eyes" );
    }

    public static void main(String[] args) {
        Dog  didi=new Dog();
        didi.eyes=2;
    }
}

//抽取共同的部分抽象化为一个Animal类中 可以做继承树（狗 猫 老虎 extends Animal）
class Animal{
    int eyes;

    public void  run(){
        System.out.println("跑");
    }

}
