package com.example.lab1w;

import org.junit.Test;

public class LabTest {

    private double ab, bc, ac;
    private double perimeter, semiPerimeter;
    private double squareHeron;

    //Создание обьекта Triangle с указанием сторон
    Triangle t1 = new Triangle(2,5,6);

    @Test
    public void Perimeter(){
        //Получение значение переменных из объекта Triangle
        ab = t1.getAB();
        bc = t1.getBC();
        ac = t1.getAC();

        System.out.println(t1);

        //Нахождение периметра
        perimeter = ab + bc + ac;
        System.out.println("Периметр этого треуголника равен:  " + perimeter );
    }

    @Test
    public void SquareHeron(){
        //Получение значение переменных из объекта Triangle
        ab = t1.getAB();
        bc = t1.getBC();
        ac = t1.getAC();

        System.out.println(t1);

        //Вычисление полупериметра
        semiPerimeter = 0.5 * (ab + bc + ac);
        System.out.println("Полупериметр этого треугольника равен: " + semiPerimeter);

        //Вычисление площади
        squareHeron = Math.sqrt (semiPerimeter * (semiPerimeter - ab) * (semiPerimeter - bc) *
                (semiPerimeter - ac));

        //2 знака после запятой
        String square = String.format("%.2f", squareHeron);

        System.out.println("Площадь треугольника по формуле Герона равна: " + square);

    }
}
