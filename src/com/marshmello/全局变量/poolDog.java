package com.marshmello.全局变量;

public class poolDog {
   private String name;
   private  int size;

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
        poolDog dog=new poolDog();
        dog.setName("旺财");

    }
}
