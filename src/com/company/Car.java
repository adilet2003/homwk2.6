package com.company;

public class Car <C , T extends Number > implements Printble {
    C year ;
    T Namber;


    public T getNamber() {
        return Namber;
    }

    public void setNamber(T namber) {
        Namber = namber;
    }

    public Car(T namber, double v) {
        Namber = namber;
    }

    public C getCulor() {
        return year;
    }

    public void setCulor(C year) {
        this.year = year;
    }

    public Car(C year) {
        this.year = year;
    }

    @Override
    public void Print(Car car) {

    }
}
