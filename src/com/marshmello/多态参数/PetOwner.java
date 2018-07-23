package com.marshmello.多态参数;
/**
 * 方法的返回类型 参数 使用 多态
 * tips: 实现  不同动物的 方法
 * */
public class PetOwner {
    void start(){
        Vet vet= new Vet();
        Dog dog=new Dog();
        Cat cat=new Cat();
        vet.giveShot(dog);
        vet.giveShot(cat);
    }
    public static void main(String[] args) {
        PetOwner petOwner=new PetOwner();
        petOwner.start();

    }
}

class Animal {
    void makeNoise(){
        System.out.println(" 动物在嘶吼！ ");
    }
}

class Cat extends Animal{
    void makeNoise(){
        System.out.println(" Cat的叫声 是 喵喵喵！ ");
    }
}
class Dog extends Animal{
    void makeNoise(){
        System.out.println(" Dog的叫声 是 汪汪汪！ ");
    }
}
class Vet extends Animal{
    public void giveShot(Animal animal){
        animal.makeNoise();
    }

}
