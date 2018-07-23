package com.marshmello.集合;

import java.util.ArrayList;
/**
 * ArrayList类 一个非常有用的List
 * */
public class learn_ArrayList {
    public static void main(String[] args) {
        //声明创建
        ArrayList<learn_ArrayList> mylist=new ArrayList<learn_ArrayList>();
        //ArrayList会产生一个'盒子' 存放对象啊   加入元素
        learn_ArrayList a=new learn_ArrayList();
        mylist.add(a);
        //查询大小
        int theSize= mylist.size();
        System.out.println("the size of arrayList is " +theSize);
        //查询特定元素
        boolean isIn=mylist.contains(a);
        System.out.println("查询特定元素 "+ isIn);
        //查询特定元素的位置
        int _index=mylist.indexOf(a);
        System.out.println("查询特定元素的位置 " +_index);

        //判断集合是否为空
        boolean empty=mylist.isEmpty();
        System.out.println("判断集合是否为空" + empty);

        //删除元素 remove()
        mylist.remove(a);
         theSize=mylist.size();
        System.out.println("after remove one element of arrayList the size is " +theSize);





    }
}
