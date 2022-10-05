package com.max.idea;
import java.util.ArrayList;
import java.io.*;
import java.util.Scanner;

public class FinalTask3_1 {

  /*  Напишите программу, где пользователь вводит сначала количество строк n, затем сами строки.
  Среди данных строк найти строку с максимальным количеством различных символов.
  Если таких строк будет много, то вывести первую.

    Пример для теста работы программы:
    Количество строк: 3
    Строка 1: привет
    Строка 2: анализ
    Строка 3: 111111111111
    Ответ: привет

   */

    public static void main(String[] args){
        Reader r = new InputStreamReader(System.in);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Количество строк: ");
        int numstr = scanner.nextInt();

        BufferedReader reader = new BufferedReader(r);
        ArrayList<String> list = new ArrayList<String>();
        int i = 0;
        for (;i < numstr;) {
            System.out.print("Строка "+(++i)+": ");
            try {
                list.add(reader.readLine());
            } catch (IOException e) {
                System.out.println("Ошибка");
            }
        }

        i = 0;
        int res, indexOfStr = 0, maxSign = (int) list.get(0).chars().distinct().count();
        while (i < list.size()-1) {
            res = (int) list.get(++i).chars().distinct().count();
            if (res > maxSign) {
                indexOfStr = i;
                maxSign = res;
            }
        }
        System.out.println ("Ответ: "+ list.get(indexOfStr));
    }
}
