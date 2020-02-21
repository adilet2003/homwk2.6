package com.company;

public class Car <C extends Number > implements Aaaaaaa {
    C year ;

    public C getCulor() {
        return year;
    }

    public void setCulor(C culor) {
        this.year = culor;
    }

    public Car(C culor) {
        this.year = culor;
    }
}
