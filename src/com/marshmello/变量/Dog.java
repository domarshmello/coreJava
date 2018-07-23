package com.marshmello.变量;
/**
 * reference对象的引用(栈里的钩子)
 * */
public class Dog {
String name;
    public static void main(String[] args) {
        Dog dogReference=new Dog();//reference 指的是 dogReference 代表取得Dog对象的方法以字节形式放进比变量dogReference里 对象本身没有放进变量里
        dogReference.name="喵";
        dogReference.bark();
        dogReference.eat();
    }

    public void bark(){
        System.out.println(name +" is barking");
    }
    public void  eat(){
        System.out.println(name +" is eating");
    }
}
