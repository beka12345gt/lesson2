package com.company;

public class Novels extends Book{
    private int year;

    public Novels(String name, String skin, int year, int year1) {
        super(name, skin, year);
        this.year = year1;
    }

    public Novels(Object name, String скольская, int year) {
        super((String) name,скольская,year);
    }

    @Override
    public void print() {
        System.out.println("Произведение: " + getName() +
                "\nВид Книги: " + getSkin() +
                "\nКнига вышла в: " + getYear());
    }
}