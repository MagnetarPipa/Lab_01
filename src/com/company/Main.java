package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.sin;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        task43();
        task68();
        task93();
        task118();
        task143();
    }

    /**
     * 43.Вычислить у = sin 1 + sin 1,1 + sin 1,2 + ... + sin 2.
     */
    private static void task43() {
        System.out.println("Задание 43");

        double y = 0, sum = 0;
        for (float i = 0f; i < 1f; i += 0.1f) {
            y = (sin(1) + sin(i + 0.1));
            sum += y;
            System.out.println("Сумма равна " + sum);
        }

    }

    /**
     * 68.
     * Гражданин 1 марта открыл накопительный депозитный счёт в банке, вложив 1000 грн.
     * Каждый месяц размер вклада увеличивается на 1,2 % от имеющейся суммы. Определить:
     * а) прирост суммы вклада за первый, второй, …, десятый месяц;+
     * б) сумму вклада через три, четыре, …, двенадцать месяцев;+
     * в) за какой по счёту месяц величина ежемесячного увеличения вклада превысит 30 грн.+
     * г) через сколько месяцев размер вклада превысит 1200 грн.+
     */
    private static void task68() {
        System.out.println("Задание 68");
        final double MONTH_PERCENT = 0.012;
        int number_mounth = 0, count_month = 0;
        double percent = 0, deposit_sum = 0, deposit_account = 1000, growth = 0;

        for (int mounth = 3; mounth <= 12; mounth++) {
            percent = ((1000 * 1.2 / 100));
            deposit_sum += percent;
            number_mounth++;
            System.out.println("Сумма вклада через " + mounth + " месяц равна=" + deposit_sum);

            growth = deposit_account + deposit_sum;
            System.out.println("Прирост суммы вклада в " + mounth + " месяц =" + growth);

            if (deposit_sum > 30.0) {
                System.out.println("Велична ежимесячнего увеличения увклада превысит 30 в " + number_mounth + " месяц");


            }

        }

        while (deposit_account <= 1200.0) {
            deposit_account = deposit_account + deposit_account * MONTH_PERCENT;

            count_month++;
        }

        System.out.println(count_month);
    }

    /**
     * 93.Известны оценки ученика по 10 предметам. Определить среднюю оценку.
     */

    private static void task93() {
        System.out.println("Задание 93");

        Random random = new Random();
        int sum = 0, average_mark = 0, current_mark = 0;
        final int SUBJECTS = 10;

        System.out.print("Элементы первого массива: |");
        for (int i = 0; i < SUBJECTS; i++) {
            current_mark = (int) (1 + Math.random() * 12);
            sum += current_mark;
        }

        average_mark = sum / 10;
        System.out.println("Сумма оценок по " + SUBJECTS + " предметам = " + sum + " Средняя оценка = " + average_mark);

    }

    /**
     * 118.Найти сумму всех n-значных чисел (1 ≤ n ≤ 4).
     */
    private static void task118() {
        System.out.println("Задание 118");
        int   sum1 = 0, sum2 = 0, sum3 = 0, sum4 = 0;
        System.out.println("Введите количество цифр в числе");
        int n = Integer.parseInt(scanner.next());
        for(;n<=4;n++)
        {
            if(n==1)
            {
                for(int i=1;i<=9;i++)
                {
                    sum1+=i;
                }
            }
            if(n==2)
            {
                for(int j=10;j<=99;j++)
                {
                    sum2+=j;
                }
            }
            if(n==3)
            {
                for(int k=100;k<=999;k++)
                {
                    sum3+=k;
                }
            }
            if(n==4)
            {
                for(int l=1000;l<=9999;l++)
                {
                    sum4+=l;
                }
            }

        }

        System.out.println("Сумма однозначных чисел="+sum1+"Сумма двузначных чисел="+sum2+"Сумма трехзначных чисел="+sum3+"Сумма четырехзначных чисел="+sum4);

    }

    /**
     * 143.Определить количество натуральных чисел, меньших n, которые не делятся на 11.
     */
    private static void task143() {
        System.out.println("Задание 143");

        int count = 0;
        int n = Integer.parseInt(scanner.next());
        for (int i = 1; i <= n;i++) {
            System.out.println(i);
            if (i % 11 != 0) {
                count++;
            }

        }
        System.out.println("Количество натуральных чисел, меньших n, которые не делятся на 11 " + count);
    }

}


