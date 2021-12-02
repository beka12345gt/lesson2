
package com.company;

public abstract class Book implements Printable {
    private String name;
    private Object Skin;
    private int year;

    public Book(String name, Object skin, int year) {
        this.name = name;
        Skin = skin;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public Object getSkin() {
        return Skin;
    }

    public int getYear() {
        return year;
    }

    public void print() {

    }
}
