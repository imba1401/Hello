package com.max.idea;

import java.util.Locale;
import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {


        //1. Пользователю предлагается на выбор ввести массу или расстояние.

        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.UK);

        System.out.print("Выберите что переводить: 1 - масса, 2 - расстояние: ");
        int operand1 = in.nextInt();

        if (operand1 == 1)
            System.out.print("Выберите единицу измерения: 1 - пуд, 2 - кг, 3 - унция, 4 - английский фунт: ");
        else if (operand1 == 2)
        System.out.print("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут: ");
        else {
            System.out.println("Ошибка ввода");
            return;
        }

        int operand2 = in.nextInt();
        if (operand2==1 || operand2==2 || operand2==3 || operand2==4) {
            System.out.print("Введите число (десятичные через точку): ");
        }
        else {
            System.out.println("Ошибка ввода. Начните заново и выберите 1,2,3,4");
            return;
        }
        double operand3 = in.nextDouble();

        if (operand1 == 1) {
            double weight; // пуд кг унцию англ.фунт
            double pud;
            double kilogram;
            double ounce;
            double eng_pound;

            double x = 0; // Ввела независимую переменную, чтобы по ней рассчитать соотношение всех других масс (это русс.фунт)

            if (operand2 == 1) {
                x = operand3 / 0.025;
                //   System.out.println(x);
            } else if (operand2 == 2) {
                x = operand3 / 0.4101;
                //   System.out.println(x);
            } else if (operand2 == 3) {
                x = operand3 / 14.41;
                //  System.out.println(x);
            } else if (operand2 == 4) {
                x = operand3 / 0.9;
                //  System.out.println(x);
            }

            pud = x * 0.025;
            kilogram = x * 0.4101;
            ounce = x * 14.44;
            eng_pound = x * 0.9;
            System.out.println("Результат:\n" + "Пуд: " + pud + " \n" + "Килограмм: " + kilogram + " \n" + "Унция: " + ounce + " \n" + "Англ.фунт: " + eng_pound + " \n");

        }

        if (operand1 == 2) {
            double meters;
            double miles;
            double yards;
            double ft;

            double y = 0; // Ввела независимую переменную, чтобы по ней рассчитать соотношение всех других длин (это пяди)
            switch (operand2) {
                case 1: y = operand3 / 0.1801; break;
                case 2: y = operand3 / 0.00011; break;
                case 3: y = operand3 / 0.19; break;
                case 4: y = operand3 / 0.58; break;
            }

            meters = y * 0.1801;
            miles = y * 0.00011;
            yards = y * 0.19;
            ft = y * 0.58;
            System.out.println("Результат:\n" + "Метры: " + meters + " \n" + "Мили: " + miles + " \n" + "Ярды: " + yards + " \n" + "Футы: " + ft + " \n");
        }
    }
}

