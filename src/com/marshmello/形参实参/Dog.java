package com.marshmello.形参实参;

public class Dog {

    String name;

    public void bark(int x){//int 形参
        while (x>0) {
            System.out.println(name + " 汪 ");
            x = x - 1;
        }
    }

    public static void main(String[] args) {
        Dog dog= new Dog();
        dog.name="旺财";
        dog.bark(5); //实参为5
    }

}
