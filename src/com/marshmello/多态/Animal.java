package com.marshmello.多态;

/**
 * 多态: 父类类型class  引用变量= new 子类对象();
 *
 * */
public class Animal {


    public void eat(){
        System.out.println("animal is eating");
    }

    public void roam(){
        System.out.println("animal is roaming");
    }


    public static void main(String[] args) {

        Animal[] animals=new Animal[3];
        animals[0]=new Lion();
        animals[1]=new Dog();
        animals[2]=new Wolf();

        for(int i=0;i<animals.length;i++){
            animals[i].eat();//0 ：狮子的方法 先调用子类的方法 子类没有走父类
            animals[i].roam();

        }

    }
}

class Dog extends Animal{
    //子类重写父类的方法
    public void eat(){
        System.out.println("Dog is eating");
    }
    public void roam(){
        System.out.println("Dog is roaming");
    }

}
class Lion extends Animal{
    public void eat(){
        System.out.println("Lion is eating");
    }
    public void roam(){
        System.out.println("Lion is roaming");
    }
}
class Wolf extends Animal{

    public void eat(){
        System.out.println("Wolf is eating");
    }
    public void roam(){
        System.out.println("Wolf is roaming");
    }

}
