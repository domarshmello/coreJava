package com.marshmello.封装;

/**
 * getter and setter
 * */
public class Guitar {

    private String brand;//品牌
    private int numOfPickups;//拾音器
    boolean rockStarUsesIt;//摇滚

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getNumOfPickups() {
        return numOfPickups;
    }

    public void setNumOfPickups(int numOfPickups) {
        this.numOfPickups = numOfPickups;
    }

    public boolean isRockStarUsesIt() {
        return rockStarUsesIt;
    }

    public void setRockStarUsesIt(boolean rockStarUsesIt) {
        this.rockStarUsesIt = rockStarUsesIt;
    }


    public static void main(String[] args) {
        Guitar guitar=new Guitar();
        guitar.setBrand("YAMAHA");
        guitar.setNumOfPickups(6);
        guitar.setRockStarUsesIt(true);
        System.out.println("the guitar name is "+ guitar.getBrand()+ " and guitar の 拾音器是" +guitar.getNumOfPickups()+ " and then guitar belong "+guitar.isRockStarUsesIt()+" 摇滚");
    }
}
