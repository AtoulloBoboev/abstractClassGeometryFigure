package com.codewithatoullo;

//Создайте класс Circle
//Фигур должна наследоваться от абстрактного класса Фигура (англ. Figure).
public class Circle extends Figure {

    //У класса Круг будет одно поле - радиус окружности (r).
    private double r;

    //Для класса необходимо реализовать конструктор, который принимает радиус окружности и цвет фигуры.
    public Circle(double r, String color) {
        super(color);
        this.r = r;
    }

    //В этих же классах, вам необходимо реализовать два метода (area() и perimeter()).
    //Формула для вычисления площадь фигуры круга
    @Override
    public double area() {
        return r * r * Math.PI;
    }

    //Формула для вычисления периметр фигуры
    @Override
    public double perimeter() {
        return 2 * Math.PI * r;
    }
}
