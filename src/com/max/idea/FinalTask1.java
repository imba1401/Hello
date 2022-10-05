package com.max.idea;
import java.util.Scanner;

public class FinalTask1 {

    public static void main(String[] args) {
/* Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
 Пользователь вводит текущий курс и количество рублей.
 Итоговое значение должно быть округлено до двух знаков после запятой.

Пример для теста работы программы:
- Курс доллара: 67,55
- Количество рублей: 1000
- Итого: 14,80 долларов
 */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Курс доллара (через запятую): ");
        float rate = scanner.nextFloat();
        System.out.print("Количество рублей: ");
        float countrubles = scanner.nextFloat();

        float result = countrubles/rate;

        if (rate==0){
            System.out.println( "Делить на 0 нельзя, введите настоящий курс доллара");}
        else if (rate>0) {
            System.out.format("%.2f",result);
        }
        }
    }