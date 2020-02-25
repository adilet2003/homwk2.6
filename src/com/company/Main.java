package com.company;

public class Main {

    public static void main(String[] args) {
        Car<Integer ,Integer> car = new Car<Integer, Integer>(10,2);
        car.print(10);
        System.out.println ( "в нутри " + car.getClass().getSimpleName());


    }
}
