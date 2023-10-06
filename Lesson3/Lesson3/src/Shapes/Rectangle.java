package Shapes;

import Interfaces.Figure;

public class Rectangle extends Figure {

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) throws RuntimeException {
        if (sideA <= 0 || sideB <= 0) {
            throw new RuntimeException("Error: all side length of rectangle must have positive value");
        }

        this.sideA = sideA;
        this.sideB = sideB;

    }

    @Override
    public double calcArea() {
        return sideA * sideB;
    }

    @Override
    public double calcPerimeter() {
        return (sideA + sideB) * 2;
    }

    @Override
    public String getInfo() {
        return "Rectangle with " + sideA + ", " + sideB + " has area: " + calcArea() + " and perimeter: "
                + calcPerimeter();
    }
}
