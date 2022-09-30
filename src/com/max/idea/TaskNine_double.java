package com.max.idea;
import java.util.Scanner;

public class TaskNine_double {

    public static void main(String[] args) {

        //1. Пользователь вводит размер массива и данные с клавиатуры в массив типа double.

        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int operand1 = in.nextInt();


        double [] arr = new double [operand1];

        for (int i = 0; i <= (operand1 - 1); i++) {
            System.out.println("Введите число (одно):");
            double value = in.nextDouble();
            arr[i] = value;
        }

        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println("Сумма элементов массива: " + total);

      //2. Посчитайте среднее арифметическое элементов массива.
        double average;
        average = total/arr.length;
        System.out.println("Среднее арифметическое: " + average);

     //3. После этого произведите вывод массива на экран
        // где каждый элемент массива умножается на среднее арифметическое
        for (int i = 0; i < arr.length; i++) {
            System.out.println( arr[i] + "*" + average);
        }



    }
}


