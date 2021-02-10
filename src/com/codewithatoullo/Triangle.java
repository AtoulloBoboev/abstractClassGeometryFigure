package com.codewithatoullo;

//Создайте класс Triangle
//Фигур должна наследоваться от абстрактного класса Фигура (англ. Figure).
public class Triangle extends Figure {

    //У класса Треугольник будет три поля - длина каждой из сторон (a,b,c).
    private double a, b, c;

    //Для класса необходимо реализовать конструктор, который принимает длина каждой из сторон и цвет фигуры.
    public Triangle(double a, double b, double c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    //В этих же классах, вам необходимо реализовать два метода (area() и perimeter()).
    //Формула для вычисления площадь фигуры Треугольника
    @Override
    public double area() {
        double helfP = perimeter() / 2;
        return Math.sqrt(helfP * (helfP - a) * (helfP - b) * (helfP - c));
    }

    //Формула для вычисления периметр фигуры Треугольника
    @Override
    public double perimeter() {
        return a + b + c;
    }
}
