package com.max.idea;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        //Напишите программу, где пользователь должен ввести строку из слов,
        // разделенных пробелами. Например: “I love java 8 Я люблю java 14 core1”.


        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку:I love java 8 Я люблю java 14 core1 : ");
        String a = scanner.nextLine();

        String[] words = a.split(" ");

        int count = 0;

        //1. Выведите слова, состоящие только из латиницы.

        for (int i = 0; i < words.length; i++) {

            boolean b;
            b = words[i].matches("^[a-zA-Z]*$");

            if (b == true) {
                System.out.println(words[i] + " ");
                count++;
            }
                // int num;
                //  if (i>0 &&b=true){
                //      System.out.println("" + num);
            }

      // 2. Выведите количество этих слов.

        System.out.println(count);

        }

    }
