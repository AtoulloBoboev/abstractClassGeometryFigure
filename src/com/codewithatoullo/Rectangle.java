package com.codewithatoullo;

//Создайте класс Figure
//Фигур должна наследоваться от абстрактного класса Фигура (англ. Figure).
public class Rectangle extends Figure {

    //У класса Прямоугольник будет два поля - ширина и высота.
    private double width, height;

    //Для класса необходимо реализовать конструктор, который принимает ширина, высота и цвет фигуры.
    public Rectangle(double width, double height, String color) {
        super(color);
        this.width = width;
        this.height = height;
    }

    //В этих же классах, вам необходимо реализовать два метода (area() и perimeter()).
    //Формула для вычисления площадь фигуры прямоугольника
    @Override
    public double area() {
        return width * height;
    }

    //Формула для вычисления периметр фигуры прямоугольника
    @Override
    public double perimeter() {
        return 2 * (width + height);
    }
}
