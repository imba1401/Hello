package com.max.idea;
import java.io.IOException;
import java.util.Scanner;

public class TaskFive {

    public static void main(String[] args) throws IOException {

        //1. Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’
        Scanner in = new Scanner(System.in);
        System.out.print("Первое число: ");
        int operand1 = in.nextInt();
        System.out.print("Второе число: ");
        int operand2 = in.nextInt();

        char sign;
        System.out.print("Введите один из символов: +,-,*,/: ");
        sign = (char) System.in.read();

        //2. В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.

            int result = 0;
            switch (sign) {
                case '+': result = operand1 + operand2; break;
                case '-': result = operand1 - operand2; break;
                case '*': result = operand1 * operand2; break;
                case '/': result = operand1 / operand2; break;
                default :
                    System.out.println("Символ не распознан, выберете один из вышеуказанных, а пока выведем вам");
            }

            System.out.println(result);
        }
    }