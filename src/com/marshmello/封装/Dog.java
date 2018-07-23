package com.marshmello.封装;
/**
 * 封装（private）size属性
 * by getter and setter 赋值 取值
 * */
public class Dog {
    private int  size;//在类的内部访问修改

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        if (s>0){
            this.size = s;
        }
    }

    void bark() {
        if(size>50){System.out.println("汪汪汪汪汪汪");}
        else if(size<10){System.out.println("呜呜呜呜");}
        else{ System.out.println("喵喵");}

    }

    public static void main(String[] args) {

        Dog dog=new Dog();
        dog.setSize(80);
        System.out.println("the first Dog の size "+ dog.getSize());
        dog.bark();

        Dog bDog=new Dog();
        bDog.setSize(7);
        System.out.println(" the second Dog  の size "+  bDog.getSize());
        bDog.bark();
    }
}
