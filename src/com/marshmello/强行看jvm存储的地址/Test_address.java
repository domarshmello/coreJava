package com.marshmello.强行看jvm存储的地址;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class Test_address {

    private static Unsafe unsafe;

    static {
        try {
            Field field = Unsafe.class.getDeclaredField("theUnsafe");
            field.setAccessible(true);
            unsafe = (Unsafe) field.get(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private static long addressOf(Object o) throws Exception {

        Object[] array = new Object[]{o};

        long baseOffset = unsafe.arrayBaseOffset(Object[].class);
        int addressSize = unsafe.addressSize();
        long objectAddress;
        switch (addressSize) {
            case 4:
                objectAddress = unsafe.getInt(array, baseOffset);
                break;
            case 8:
                objectAddress = unsafe.getLong(array, baseOffset);
                break;
            default:
                throw new Error("unsupported address size: " + addressSize);
        }
        return (objectAddress);
    }
    //throws Exception main 调用addressOf()  main属于上一级
    public static void main(String[] args){
        int a=10;
        int b=11;
        try {
            System.out.println(addressOf(a));
            System.out.println("---test---");
            System.out.println(addressOf(b));
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("-------------------");
        Test_address test=new Test_address();

        try {
            System.out.println(addressOf(test));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
