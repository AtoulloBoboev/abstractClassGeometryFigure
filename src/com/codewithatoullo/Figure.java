package com.codewithatoullo;

//Создайте абстрактный класс Фигура (англ. Figure)
public abstract class Figure {

    //У всех фигур в нашей программе есть цвет, поэтому в классе Фигура есть строковое поле color.
    private String color;

    //Создайте конструктор
    public Figure(String color) {
        this.color = color;
    }

    //Создайте геттер и сеттер для этого поля.
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //У класса Фигура определены два абстрактных метода: public abstract double area(); public abstract double perimeter();
    //Реализация первого метода должна возвращать площадь фигуры, а реализация второго метода должна возвращать периметр фигуры.
    public abstract double area();

    public abstract double perimeter();
}
