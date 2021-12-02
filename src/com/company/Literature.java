package com.company;

public class Literature extends Book {
    private String name;


    public Literature(String name, String skin, int year, String name1) {
        super(name, skin, year);
        this.name = name1;
    }

    public Literature(Object name, String skin, int year) {
        super((String) name, skin,1988 );
    }

    @Override
    public void print() {
        System.out.println("Произведение: " + getName() +
                "\nВид Книги: " + getSkin() +
                "\nКнига вышла в: " + getYear());
    }
}