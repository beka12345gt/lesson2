package com.company;

public class Fantastic extends Book {
    private String skin;


    public Fantastic(String name, String skin, int year, String skin1) {
        super(name, skin, year);
        this.skin = skin1;
    }

    public Fantastic(Object name, String skin, int year) {
        super((String) name, skin, year);
    }

    @Override
    public void print(){
        System.out.println("Произведение: " + getName() +
                "\nВид Книги: " + getSkin() +
                "\nКнига вышла в: " + getYear());
    }
}
