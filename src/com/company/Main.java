package com.company;

public class Main {

    public static void main(String[] args) {
        Car<Double , Integer > car= new Car<Double, Integer>(10.1,11);
        Playable p = new Car(12,2);
        System.out.println(car.year);


    }
}