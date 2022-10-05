package com.max.idea;
import java.util.Random;

public class Task14 {

    public static void main(String[] args) {
        //Напишите программу, заполняющую массив из 15 элементов рандомными
        // значениями в диапазоне от -20 до 20. Далее:

        //1. Выведите максимальный и минимальный элемент массива.

        //2. Из максимального и минимального значения выведите наибольшее по модулю.

        Random rand = new Random();

        int[] array = new int[15];

        for (int i = 0; i < array.length; i++)
            array[i] = (int) Math.round((Math.random() * 40) - 20);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        //1. Выведите максимальный и минимальный элемент массива.
        int maxNum = array[0];
        for (int j : array) {
            if (j > maxNum)
                maxNum = j;
        }

        System.out.println(" ");
        System.out.println("Maximum number = " + maxNum);

        int minNum = array[0];
        for (int j : array) {
            if (j < minNum)
                minNum = j;
        }

        System.out.println("Minimum number = " + minNum);


        //  2. Из максимального и минимального значения выведите наибольшее по модулю.
        // Не поняла исходное число надо вывести или модуль, сделала 2 варианта

        // Вывела наибольший модуль (вариант 1)
        if (Math.abs(minNum) == Math.abs(maxNum)) {
            System.out.println("Они по модулю равны: " + Math.abs(minNum));
        } else if (Math.abs(minNum) < Math.abs(maxNum)) {
            System.out.println("Наибольшее по модулю (max): " + Math.abs(maxNum));
        } else {
            System.out.println("Наибольшее по модулю(min): " + Math.abs(minNum));
        }

        // Здесь вывела число большее по модулю (вариант 2)
        if (Math.abs(minNum) > Math.abs(maxNum))
            System.out.println("Наибольшее по модулю(min): " + minNum);
        }
    }