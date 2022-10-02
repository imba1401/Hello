package com.max.idea;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        //1. Введите первое число с клавиатуры и записать его в строковую переменную.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        String a = scanner.nextLine();

        Integer y = new Integer(a);


        //2.Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
        System.out.print("Введите целое положительное 2е число: ");
        int b = scanner.nextInt();

        //3.Сравнить 2 числа и вывести большее на экран

        if (y > b)
            System.out.println("Большее число: " + y);
        else System.out.println("Большее число: " + b);


        //4.1. Выведите также меньшее число на экран, предварительно
        // переконвертировать его в тип double.

       Double z = new Double(y);
       Double w = new Double(b);

        if (z > w)
            System.out.println("Меньшее число: " + w);
        else System.out.println("Меньшее число: " + z);
    }
}
