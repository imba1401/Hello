package com.max.idea;

import java.util.Scanner;

public class TaskEight {
    public static void main(String[] args) {
        //пользователь вводит любое целое положительное число n.
        // А программа суммирует все нечетные числа от 1
        // до введенного пользователем числа n.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое положительное число: ");
        int n = scanner.nextInt();

        for (int i = 1; i<=n; i+=2){
            int res = i+n;
            System.out.println(i + "+" + n + "=" + res);
        }

        // сначала подумала, что имелось в виду в задании типа таблицы сделать сложения (как в теории было дано),
        //но перечитав позже задание поняла, что эта реализация больше подходит

        int res = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0){
                res+=i;
            }
        }
        System.out.println("\nИтого сумма нечетных чисел:" + res);

    }
}
