import Interfaces.Figure;
import Shapes.Triangle;
import Shapes.Square;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       List<Figure> figures = new ArrayList<>();

       try {
           figures.add(new Triangle(3, 4, 5));
       } catch (RuntimeException e) {
           System.out.println(e.getMessage());
       }

        try {
            figures.add(new Triangle(4, 5, 7));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            figures.add(new Triangle(1, 2, 3));
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
           figures.add(new Square(5));
       } catch (RuntimeException e) {
           System.out.println(e.getMessage());
       }

       try {
           figures.add(new Square(10));
       } catch (RuntimeException e) {
           System.out.println(e.getMessage());
       }

        for (Figure item: figures) {
            System.out.println(item.getInfo());
        }

    }
}


// Архитектура ПО (семинары)
// Урок 3. Принципы SOLID
// Написать на любом языке программирования программу, в которой идёт работа со следующими геометрическими фигурами:

// Треугольник
// Квадрат
// Прямоугольник.
// Круг

// В программе имеется массив фигур, с которым можно сделать следующие операции:
// Добавить новую фигуру
// Посчитать периметр у всех фигур
// Посчитать площадь у всех фигур Для фигуры использовать базовый абстрактный класс фигуры, у которого есть методы посчитать периметр и посчитать площадь фигуры. Массив фигур в программе должен быть представлен как массив объектов этого базового класса. Массив фигур должен создаваться и вся работа с ним идёт внутри main. При создании фигур необходимо осуществлять проверку входных данных на возможность создания данной фигуры и в случае ошибки выдавать соответствующие сообщения.