package com.company;

public class Car <C , T extends Number > implements Playable {
    C year ;
    T Namber;


    public Car(C year, T namber) {
        this.year = year;
        Namber = namber;
    }


    public C getYear() {
        return year;
    }

    public void setYear(C year) {
        this.year = year;
    }

    public T getNamber() {
        return Namber;
    }

    public void setNamber(T namber) {
        Namber = namber;
    }



    @Override
    public void print(Number number) {

    }

    @Override
    public Number playSong() {
        return null;
    }
}
