package com.max.idea;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
       /* 1. Создайте переменную типа с плавающей точкой с наибольшим диапазоном чисел. Присвойте ей
       произвольное дробное значение  */

        double a;
        double b = 5.8475;

        /* 2. Создайте переменную целочисленного типа с наименьшим диапазоном чисел. Присвойте ей наибольшее
         возможное значение */
        byte c;
        byte d = 127;

       //ЗАДАНИЕ 3 МАССИВЫ

        int massive[] = {1, 2, 3, 4, 5};
        // Первый и последний поменять местами
        massive[0] = 1;
        massive[1] = 2;
        massive[2] = 3;
        massive[3] = 4;
        massive[4] = 5;
        System.out.print(massive[4]);
        System.out.print(massive[1]);
        System.out.print(massive[2]);
        System.out.print(massive[3]);
        System.out.print(massive[0]);
        System.out.println();

        // Не поняла какую сумму: первый и средний или последний и средний. Сделала оба

        System.out.println("Результат суммы первого (1) и среднего элемента (3) = " + (massive[massive.length-4] +massive[massive.length-3]));
        System.out.println("Результат суммы последнего (5) и среднего элемента (3) = " + (massive[massive.length-1] +massive[massive.length-3]));
    }}


