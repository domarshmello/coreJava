package com.marshmello.数组;
/**
 * 封装
 * 有很多只狗 ---> Dog对象数组的引用
 * */
public class Dog {
    private String name;
    private int size;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public static void main(String[] args) {

        Dog[] pets =new Dog[3]; //Dog 对象数组的引用
        for (int i=0;i<pets.length;i++){
            pets[i]=new Dog();
            pets[i].setSize(10+3*i);
            System.out.println("第" +i+ " 只狗狗的sizes "+pets[i].getSize());

        }
    }
}
