package com.max.idea;
import java.util.Scanner;

public class TaskFour {

    public static void main(String[] args) {
        //1. Ввести три числа с клавиатуры x, y, z
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num = in.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = in.nextInt();
        System.out.print("Введите третье число: ");
        int num3 = in.nextInt();

        //2. Найти и вывести в консоль среднее арифметическое этих чисел
        int num4 [] = {num, num2, num3};
        double sum = 0;
        for (int x : num4)
            sum += x;
        double average = sum / num4.length;
        System.out.println(average);

        //3.Разделить среднее арифметическое на 2 и округлить в меньшую сторону
        double nadwa = average/2;
        double okruglenie = nadwa = + Math.floor(nadwa);
        System.out.println(okruglenie);

        //4.Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
        if (okruglenie > 3)
            System.out.println("Программа выполнена корректно");
    }
}




