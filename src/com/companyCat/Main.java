package com.companyCat;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //OneTask();
        //TwoTask();
        //HomeTask1();
        //HomeTask2();
        //HomeTask3();
        //HomeTask5();
        //HomeTask7();
        HomeTask11();


    }

    private static void HomeTask11() {
        //11) Напишите программы, которые выводят на экран :
        // прямоугольник
        // прямоугольный треугольник
        // равносторонний треугольник
        // ромб
        int a = 25;
        int b = 10;
        int j = 0, i = 0;
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                System.out.print(" * ");

            }
            System.out.println(System.lineSeparator());
        }
        System.out.println("------------------------------");
        for (i = 0; i < a; i++) {
            for (j = 0; j < b; j++) {
                System.out.print(" * ");

            }
            b--;
            System.out.println(System.lineSeparator());
        }


        System.out.println("------------------------------");
        for (i = 0; i < a; i++) {


            for (int k = 1; k < a/2; k++) {
                if (k <= i) {
                    System.out.print("   ");
                } else {
            System.out.print(" * ");
        }
            }

            for (j = 0; j < a/2; j++) {
                System.out.print(" * ");

            }
            a--;
            System.out.println(System.lineSeparator());
        }

    }



private static void HomeTask7() {
        //  7) Найти 15 первых натуральных чисел, делящихся нацело на 19 и больших 100.
        int  Del = 19;
        int count= 0;
        long Nature19 = 0;
        for (int i = 101; count<15; i++) {
            Nature19 = i % Del;
            if (Nature19==0){
                System.out.println("Номер "+(++count)+". число "+i+ " делится на 19 нацело");
            }


        }
    }

    private static void HomeTask5() {
        //5) Вычислить значения функции
        // z1= summ i=1;15 (i+xi)i!
         //где xi — элементы, вводимые с клавиатуры.
        double x=0,z1=0;
        Scanner scanner = new Scanner(System.in);
        final int IMAX=15;
        for (int i = 1; i <= IMAX ; i++) {
            System.out.println("Введите x для итерации"+i);
            x = scanner.nextDouble();
            z1+=(i+x)/factorial(i);
            // тест
            // System.out.println("z1 = "+z1+" для итерации "+i);
        }
        System.out.println("z1 = "+z1);


    }

    private static void HomeTask3() {
        //Дано натуральное число. Верно ли, что цифра а встречается в нем реже, чем
        //цифра b?
        Scanner scanner = new Scanner(System.in);
        int a = 0, b = 0;
        long a1 = 0, b1=0;
        long Number = 0, rang = 1;
        long Number1=1;


        System.out.println(" введите натуральное число и введите цифры a b - " +
                "будем проверять какое число встречается чаще"+System.lineSeparator());
        Number = scanner.nextLong();
        a = scanner.nextInt();
        b = scanner.nextInt();

        for (rang = 10; rang<=Number*10; rang*=10) {
            Number1 = Number % rang/(rang/10);

            if (a==Number1){
                a1++;
            }
            else
                if (b==Number1){
                    b1++;
                }
        }
        System.out.println( a1 > b1? "цифра a ="+a+" встречается чаще "+a1+" раз чем цифра b= "+b+"," +
                " которая встречается "+b1+ System.lineSeparator() : b1 > a1 ? "цифра b  = "+b+" " +
                "встречается чаще "+b1+" раз чем цифра a = "+a+" которая встречается "+a1+
                System.lineSeparator():"цифры встречаются одинаковое количество раз = "+a1);
    }

    private static void HomeTask2() {
        //2) Написать программу вычисления функции y=ax^2+b при a = 3, b = -5
        // Аргумент x принимает значения от 1 до 5 с шагом 0,5.
        float x = 0, y=0, a = 3, b = -5;
        for (x = 1; x <= 5; x+=0.5) {
            y = a * x * x + b;
            System.out.println("x = " + x + " y = " + y +System.lineSeparator());

        }
    }

    private static void HomeTask1() {
        //Составить программу для вычисления значений функции
        //F x на отрезке a b с шагом h
        //Результат представить в виде таблицы, первый столбец которой —
        //значения аргумента, второй — соответствующие значения функции.
        //а) F(x) = x - sin(x)
        //b) F(x) = sin^2(x)
        //c) F(x) = 2*cos(x)-1
        Scanner scan = new Scanner(System.in);
        double x = 0, a = 0, b = 0, h = 0, funcA = 0, funcB = 0, funcC = 0;
        System.out.println("введите значения отрезка A B и шаг h");
        a = scan.nextDouble();
        b = scan.nextDouble();
        h = scan.nextDouble();
        //чтобы вывести сначала все значения по одной функции потом по второй потом по третьей это три цикла или
        //можно как то в одном цикле?
        for (x = a; x <= b; x += h) {
            funcA = x - Math.sin(x);
            funcB = Math.sin(x)*Math.sin(x);
            funcC = 2 * Math.cos(x) - 1;
            System.out.println("x = "+ x+" funcA = "+funcA + System.lineSeparator()+
                    "x = "+ x+" funcB = "+funcB + System.lineSeparator()+
                    "x = "+ x+" funcC = "+funcC);

        }
    }

    public static int factorial(int n) {
        int factor = 1;
        for (int i = 1; i <= n; i++) {
            factor *= i;
        }
        return factor;
    }

    private static void TwoTask() {

        //x-x3/3!+x5/5!-x7/7!+x9/9!-x11/11!+x13/13!
        Scanner scanner = new Scanner(System.in);
        double sign = 1, y = 0, x = 1, xPow=0;
        int f=1;
        //System.out.println("Введите x");
       // x = scanner.nextDouble();

        for (int i = 1; i <= 11; i += 2) {
            y += sign * Math.pow(x, i) / f;
            f=f*(i+1)*(i+2);
            //System.out.println(sign * Math.pow(x, i) / factorial(i));
            sign *= -1;
        }
        System.out.println(y);
    }

    private static void OneTask() {
        int a = 12345679;

        for (int Counter = 9; Counter <= 81; Counter += 9) {
            System.out.println(a * Counter);
        }
    }
}
