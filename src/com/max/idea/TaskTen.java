package com.max.idea;
import java.util.Scanner;

public class TaskTen {
    //Напишите программу, где пользователь вводит данные с клавиатуры в матрицу,
    // а после этого произведите вывод первой строки матрицы на экран,
    // где каждый элемент умножается на 3. Размерность матрицы задается пользователем.

    public static void main(String[] args) {

        //1. Пользователь задает размер матрицы

        Scanner in = new Scanner(System.in);

        System.out.print("Введите кол-во строк в матрице: ");
        int rows = in.nextInt();

        System.out.print("Введите кол-во столбцов в матрице: ");
        int cols = in.nextInt();


        int[] arr = new int[rows * cols];

        int value;
        System.out.print("Введите " + cols*rows + " чисел через пробел: ");
        for (int j = 0; j < rows; j++) {
            for (int i = 0; i < cols; i++) {
                value = in.nextInt();
                arr[i] = value;

                if (j == 0) {
                    System.out.println(value + "*" + 3);
                }
            }
        }
    }
}





