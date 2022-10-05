package com.max.idea;
import java.io.CharArrayWriter;
import java.io.Console;
import java.util.Scanner;

public class FinalTask3 {

    /*Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки.
     Среди данных строк найти строку с максимальным количеством различных символов.
      Если таких строк будет много, то вывести первую.


    Пример для теста работы программы:

    Количество строк: 3
    Строка 1: привет
    Строка 2: анализ
    Строка 3: 111111111111
    Ответ: привет

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество строк: ");
        int numstr = scanner.nextInt();
        System.out.println(numstr);

        String t = null;
        long q = 0;
        int max = 0;
        String t1 = null;

        for (int i = 0; i <= numstr; i++) {
            t = scanner.nextLine();
            q = (int) t.chars().distinct().count();


           // System.out.println(q); // единственно не поняла почему когда я выводила q было 0 после 3

            for (int j = 0; j < q; j++) {
                if (max < q) {
                    max = (int) q;
                }


            }
        }
        System.out.println("Итого большее " + max);

        if (q == max) {
            System.out.println(t); // смогла вывести только если последнее значение самое большое,
            // например, если из примера "привет" будет последнее
        }
    }
}

