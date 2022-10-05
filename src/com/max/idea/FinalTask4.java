package com.max.idea;

import java.util.Scanner;

public class FinalTask4 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Отгадайте загадку:\n\"Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает\"");
        System.out.print("Подсказка доступна на 1ой попытке, далее - будет расценена как ответ. Для начала работы нажмите enter");
        String question = scanner.nextLine();


        String right = "Заархивированный вирус";
        String tips = "Подсказка";
        int result;
        int result2;
        int count = 2;

        //1. У пользователя есть 3 попытки, чтобы отгадать загадку.

        for (int i = 0; i <= 2; i++) {

            System.out.println("Ваш ответ:");
            String ans = scanner.nextLine();
            result = ans.compareTo(right);
            result2 = ans.compareTo(tips);


            /*5. Также пользователь имеет право на подсказку при первой попытке,
            при этом 2 и 3 попытки уже недоступны. Если на первой попытке он введет строку “Подсказка”,
            вывести любую подсказку. Если на 2 и 3, вывести “Подсказка уже недоступна”.*/

                if (result2 == 0) {

                    if (i == 1 || i == 2) {
                        System.out.println("Подсказка недоступна");
                    }
                    if (i == 0) {
                        System.out.println("В интернет капусте обитает червяк.\n\nВаш ответ: ");
                    }
                    if (i <= 0) {
                        ans = scanner.nextLine();
                        result = ans.compareTo(right);
                        if (result == 0) {
                            System.out.println("Правильно!");
                            break;
                        }
                        else {
                            System.out.println("\nОбидно, приходи в другой раз"); //6. Если пользователь, использовавший подсказку, ошибется,вывести “Обидно, приходи в другой раз” и завершить работу.
                            break;
                        }
                    }

                }

                if (result == 0) {
                    System.out.println("Правильно!");//2. Если пользователь ввел верный ответ, вывести: “Правильно!” и завершить работу.
                    break;
                } else if (count > 0) {
                    System.out.println("\nПодумай еще! Осталось " + count + " попыток"); //3. Если пользователь ввел неверный ответ на 1 или 2 попытке, вывести “Подумай еще!” и еще раз запросить ответ у пользователя.
                    count--;

                } else if (count == 0){

                    System.out.println("\nОбидно, приходи в другой раз"); //4. Если пользователь сделал 3 неправильных попытки, вывести  “Обидно, приходи в другой раз” и завершить работу.
                    break; }
            }

        }
    }


