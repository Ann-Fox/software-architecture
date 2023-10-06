package Shapes;

import Interfaces.Figure;

public class Circle extends Figure {

    private double radius;

    public Circle (double radius) throws RuntimeException {
        if(radius <= 0){
            throw new RuntimeException("Error: radius length of circle must have positive value");
        }

        this.radius = radius;
    }
    @Override
    public double calcArea(){
        return Math.ceil(Math.PI * Math.pow(radius, 2));
    };

    @Override
    public double calcPerimeter(){
        return Math.PI * (2*radius);
    };

    @Override
    public String getInfo(){
        return "Circle with " + radius + " has area: " + calcArea() + " and perimeter: "
        + calcPerimeter();
    };
}
