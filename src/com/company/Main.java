package com.company;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.sin;

public class Main {

    private static final Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        //Formula();
        task43();
        task68();
        task93();
        task118();
        task143();
    }

    /**
     * 43.Вычислить у = sin 1 + sin 1,1 + sin 1,2 + ... + sin 2.
     */
    private static void task43()
    {
        System.out.println("Задание 43");

        float y=0,sum=0;
        for(float i=0;i<1;i+=0.1)
        {
            y = (float)(sin(1)+sin(1+i+0.1));
            sum += y;
           System.out.println("Сумма равна " + sum + " у равно "+ y +" I равно "+i);
        }

        //10,4319
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
    private static void task68()
    {
        System.out.println("Задание 68");

        int number_mounth=0,count_month = 0;
        double percent=0,deposit_sum=0,deposit_account=1000,growth=0;

        for (int mounth=3;mounth<=12;mounth++)
        {
            percent= ((1000*1.2/100));
            deposit_sum+=percent;
            number_mounth++;
            System.out.println("Сумма вклада через " + mounth + " месяц равна=" + deposit_sum);

            growth=deposit_account+deposit_sum;
            System.out.println("Прирост суммы вклада в " +mounth + " месяц ="+ growth);


            if(deposit_sum>30.0)
            {
               System.out.println("Велична ежимесячнего увеличения увклада превысит 30 в " + number_mounth + " месяц ");

            }

        }



        while (deposit_account <=1200.0)
        {
            deposit_account = deposit_account + deposit_account * 0.012;

            count_month ++;
        }

        System.out.println(count_month);
    }
/**
 * Известны оценки ученика по 10 предметам. Определить среднюю оценку.
 */

    private static void task93()
    {
        System.out.println("Задание 93");

        int sum=0,average_mark=0;

        int array[]=new int[10];
        System.out.print("Элементы первого массива: |");
        for(int i=0;i<array.length;i++)
        {
            Random random =new Random();
            array[i]=(int)(1+Math.random()*12);
            System.out.print(array[i]+"|");
            sum +=array[i];
            //array[i]= random.nextInt(bound : 4 );
        }
        System.out.println();

        average_mark=sum/10;
        System.out.println("Сумма оценок по всем предметам = "+sum+" Средняя оценка = "+average_mark);

    }

    /**
     * Найти сумму всех n-значных чисел (1 ≤ n ≤ 4).
     */
    private static void task118()
    {
        System.out.println("Задание 118");

        int n=0,k=0,sum=0;
        System.out.println("Введите");
       // int M= Integer.parseInt(scanner.next());
        int O= Integer.parseInt(scanner.next());
        System.out.println(" Верхняя граница-->"+O);
        for(int i=1;i<O;i++)
        {
            sum+=i;

        }
        System.out.println(" Сумма всех n-значных чисел от 1 до "+O+" 4равна "+sum);

    }

    /**
     *Определить количество натуральных чисел, меньших n, которые не делятся на 11.
     */
    private static void task143()
    {
        System.out.println("Задание 143");

        int count=0;
        int n= Integer.parseInt(scanner.next());
        for(int i=11;i<n;i+=11)
        {
            System.out.println(i);
            if(i%11==0)
            {
                count++;
            }

        }
        System.out.println("Количество натуральных чисел, меньших n, которые не делятся на 11 "+count);
    }
    /**
     * Task Number=43
     * Task Number=68
     * Task Number=93
     * Task Number=118
     * Task Number=143
     */

    private static void Formula()
    {
        int N=18,G=1;
        for(int K=1;K<6;K++)
        {

           int task_number=(24 + N + (K - 1) *25)+G;
           System.out.println("Task Number=" + task_number + " K="+K);
        }


    }

}
