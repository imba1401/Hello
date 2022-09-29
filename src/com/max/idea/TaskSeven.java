package com.max.idea;

import java.util.Locale;
import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        //1. Пользователь вводит размер массива и данные с клавиатуры в массив
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.UK);

        System.out.print("Введите размер массива: ");
        int operand1 = in.nextInt();

        System.out.println("Введите числа в массив по одному или все сразу (через пробел):");
        for (int s = 0; s < operand1; s++) {
            System.out.println(" ");

            int q = in.nextInt();
            int array23[] = {q};

                //2. Сравнить элементы массива с заранее заданными константами x, y, z.
                int x = 50, y = 15, z = 45;

                // 3. Если массив содержит хотя бы одну из констант, вывести текст "Данное значение имеется в константах".
                if (q == x || q == y || q == z) {
                    System.out.println("Данное значение " + q + " имеется в константах");
                }

                if (q < x) {
                    System.out.println(q + " < " + x);
                }
                else if (q == x) {
                    System.out.println(q + " = " + x);
                }
                else System.out.println(q + " > " + x);

                if (q < y) {
                    System.out.println(q + " < " + y);
                } else if (q == y) {
                    System.out.println(q + " = " + y);
                }
                else System.out.println(q + " > " + y);

                if (q < z) {
                    System.out.println(q + " < " + z);
                } else if (q == z) {
                    System.out.println(q + " = " + z);
                }
                else System.out.println(q + " > " + z);
            }
        }
    }
