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
        int first = massive[0];
        massive[0] = massive[4];
        massive[4] = first;

        // Не поняла какую сумму: первый и средний или последний и средний. Сделала оба

        System.out.println("Результат суммы первого (5) и среднего элемента (3) = " + (massive[massive.length-5] + massive[massive.length-3]));
        System.out.println("Результат суммы последнего (1) и среднего элемента (3) = " + (massive[massive.length-1] + massive[massive.length-3]));
    }
}


