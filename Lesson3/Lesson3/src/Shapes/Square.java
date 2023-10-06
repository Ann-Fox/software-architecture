package Shapes;

import Interfaces.Figure;

public class Square extends Figure {

    private double side;

    public Square(double side) throws RuntimeException {
        if (side <= 0) {
            throw new RuntimeException("Error: side length of square must have positive value");
        }

        this.side = side;
    }

    @Override
    public double calcArea() {
        return side*side;
    };

    @Override
    public double calcPerimeter(){
        return side * 4;
    };

    @Override
    public String getInfo(){
        return "Square with " + side  +  " has area: " + calcArea() + " and perimeter: " + calcPerimeter();
    };

}
