package com.max.idea;
import java.io.IOException;
import java.util.Scanner;

public class TaskFive {

    public static void main(String[] args) throws IOException {

        //1. Ввести 2 числа с клавиатуры, затем один из символов ‘+’, ‘-’, ‘*’ или ‘/’
        Scanner scanner = new Scanner(System.in);
        System.out.print("Первое число: ");
        int operand1 = scanner.nextInt();
        System.out.print("Второе число: ");
        int operand2 = scanner.nextInt();


       System.out.print("Введите один из символов: +,-,*,/: ");
      String sign = scanner.nextLine();
         sign = scanner.nextLine();

        //2. В зависимости от символа вывести в консоль результат выполнения соответствующей арифметической операции.

        int result;
            switch (sign) {
                case "+":
                    result = operand1 + operand2;
                    System.out.println(result);
                    break;
                case "-": result = operand1 - operand2;
                    System.out.println(result);
                    break;
                case "*": result = operand1 * operand2;
                    System.out.println(result);
                    break;
                case "/":
                    if (operand2 == 0)
                        System.out.println("Делить на 0 нельзя");
                    else {
                        result = operand1 / operand2;
                        System.out.println(result);
                    }
                    break;
                default:
                    System.out.println("Символ не распознан, выберете один из вышеуказанных");
            }
        }
    }