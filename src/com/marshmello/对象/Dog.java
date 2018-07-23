package com.marshmello.对象;

/**
 * 同一个对象不同的属性状态 对应 不同的方法
 * 属性也会影响对象的方法
 * */
public class Dog {

   private int size;
   private String name;

   public void bark(){
        if(size>60){System.out.println(name +" 2333333333333333");}
        else if (size>14){System.out.println(name +" 233");}
        else{System.out.println(name + " 233333");}
    }

    public static void main(String[] args) {
        Dog littleDog=new Dog();
        littleDog.name="毛毛";
        littleDog.size=10;
        littleDog.bark();

        Dog mDog=new Dog();
        mDog.name="阿熊";
        mDog.size=40;
        mDog.bark();

        Dog BigDog=new Dog();
        BigDog.name="旺财";
        BigDog.size=80;
        BigDog.bark();



    }
}
