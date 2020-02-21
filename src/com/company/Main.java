package com.company;

public class Main {

    public static void main(String[] args) {
        Car<Double , Integer > car= new Car<Double, Integer>(23 , 2.2 );
        System.out.println(car.year);
    }
}
