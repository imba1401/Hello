package com.max.idea;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {

        //Напишите программу, принимающую на вход строку “I like Java!!!”, которая будет выполнять следующие действия:

        String str = "I like Java!!!";

        //1. Проверить, содержит ли строка подстроку “Java” (используйте contains()).
        String substring = "Java";
        boolean result3 = str.contains(substring);
        System.out.println(result3);

        //2. Проверить, начинается ли строка с подстроки “I like” (используйте startsWith()).
        boolean result = str.startsWith("I like");
        System.out.println(result);

        //3. Проверить, заканчивается ли строка с подставки “!!!” (используйте endsWith()).
        boolean result2 = str.endsWith("!!!");
        System.out.println(result);

        //4. Если 3 предыдущих условия верны, выведите данную строку, преобразованную к верхнему регистру.

        if (result == result2 == result3 == true){
            String result4 = str.toUpperCase();
            System.out.println(result4);
        }

        //5. Замените все символы ‘a’ на ‘о’ и введите подстроку “Jovo” на экран (используйте substring()).
        String result5 = str.replace("a","o");
        System.out.println(result5);
    }
}
