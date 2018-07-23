package com.marshmello.重载;
/**
 * 方法名相同  参数不同(个数 类型)
 * */
public class test {
    String id;

    public  int addNums(int a,int b){

        return a+b;
    }
    public  double addNums(double a,double b){
        return a+b;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
//方法重载
    public void setId(String id ,int num) {
//        this.id = id;
        String numstring =id +num ;
        setId(numstring);

    }



    public static void main(String[] args) {
        System.out.println("-------------------------");
        test test=new test();
        System.out.println("10+20 ="+test.addNums(10,20));

        System.out.println("-------------------------");
        test.setId("1000");
        System.out.println("id ="+test.id);

        System.out.println("------------下面实现重载的方法(根据参数的个数判断调用的重载方法)-------------");
       test.setId("11",1000);
        System.out.println("id ="+test.id);

    }
}
