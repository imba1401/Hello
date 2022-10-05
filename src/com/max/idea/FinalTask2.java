package com.max.idea;
import java.util.Scanner;

public class FinalTask2 {

    public static void main(String[] args) {
        /* Напишите программу, которая позволит решить простое уравнение относительно x.
         Программа принимает на вход строку длиной 5 символов.
Второй символ строки является знаком ‘+’ или ‘-’, четвертый символ строки ‘=’.
Первым, третьим и пятым символом являются две цифры (от 0 до 9)
 и буква ‘x’ (обозначает неизвестное) в любом порядке.

Нужно найти неизвестное.

Пример для теста работы программы:

- Ввод: x+5=7
- Вывод: 2
- Ввод: 3-x=9
- Вывод: -6
- Ввод: 3-3=x
- Вывод: 0
*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите простое уравнение c цифрами (от 0 до 9) и x");
        System.out.print("Например, x+5=7: ");

        String operand1 = scanner.nextLine();

        String[] n = new String[5];      //1.строка 5 символов
         n = new String[]{operand1};

        //1ый, 3ий и 5ый символом являются две цифры (от 0 до 9) и буква ‘x’ в любом порядке

        char a = operand1.charAt(0);
        char sign = operand1.charAt(1); //2ой символ строки является знаком ‘+’ или ‘-’,
        char b = operand1.charAt(2);
        char equal = operand1.charAt(3); //4ый символ строки ‘=’.
        char c = operand1.charAt(4);


        if (sign == '+') {
            int ans;
            if (a == 'x') {
                ans = c - b;
                System.out.println(ans);
            } else if (b == 'x') {
                ans = c - a;
                System.out.println(ans);
            } else if (c == 'x') {
                ans = a + b;
                System.out.println(ans);
            }
        }

            if (sign == '-') {
                int ans1;
                if (b == 'x') {
                    ans1 = a - c;
                    System.out.println(ans1);
                } else if (c == 'x') {
                    ans1 = a - b;
                    System.out.println(ans1);

                } else if (a == 'x') {
                    ans1 = (b + c)-96; // почему тут 96 см. ниже комментарии
                    System.out.println(ans1);
                }
            }
        }
    }

/* тестовые сценарии проходит, но когда я стала отнимать например, x-3=4 выдавало 103, я поняла,
что отсчет ведется с разницей в 96 (это учла в коде), но не поняла почему и не смогла найти ответ в рамках ограниченного времени.
буду рада если оставите пояснение))
 */