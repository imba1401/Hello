package com.max.idea;

public class TaskFour {
    public static void main(String[] args) {
        //Ввести три числа с клавиатуры x, y, z
        int num[] = {10, 20, 1};
        // Найти и вывести в консоль среднее арифметическое этих чисел
       double sum = 0;
        for (int x : num)
            sum += x;
        double average = sum / num.length;
           System.out.println(average);

        //Разделить среднее арифметическое на 2 и округлить в меньшую сторону
        double nadwa = average/2;
        double okruglenie = nadwa = + Math.floor(nadwa);
        System.out.println(okruglenie);

        //Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
        if (okruglenie > 3)
            System.out.println("Программа выполнена корректно");
        }
    }




