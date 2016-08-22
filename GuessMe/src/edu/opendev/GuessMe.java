package edu.opendev;

import java.util.Random;
import java.util.Scanner;

public class GuessMe {

    public static void run() {
        Scanner input = new Scanner(System.in);
        int max = 0;
        while (max<1) try {
            System.out.println("Введите максимальное число для Игры:");
            max = input.nextInt();
        } catch (Exception e) {
            System.out.println("Вы ввели неправильное значение.");
        }
        GuessMe.game(max);
    }

    private static void game(int max) {
        Random rd = new Random();
        Integer value = Integer.valueOf(rd.nextInt(max) + 1);
        Scanner input = new Scanner(System.in);
        int user = 1;
        int i=0;
        while (value!=user) {
            System.out.print("Введите число: ");
            user = input.nextInt();
            if (value>user) {
                System.out.println("Больше! :Р");
            } else {
                System.out.println("Меньше! ;)");
            }
            i++;
        }
        System.out.format("Поздравляем! Вы выйграли!" + "Количество попыток = %d", i);

    }

}
