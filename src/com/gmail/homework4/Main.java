package com.gmail.homework4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* 1. С помощью циклов нарисовать «обои». Причем количество полос
должно вводиться с клавиатуры. В примере 7 полос.
***+++***+++***+++***
***+++***+++***+++***
***+++***+++***+++***
***+++***+++***+++***
***+++***+++***+++****/
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество полос");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j % 2 == 0) {
                    System.out.print("***");
                } else {
                    System.out.print("+++");
                }
            }
            System.out.println();
        }

        /* 2. Вычислить с помощью цикла факториал числа - n введенного с
клавиатуры (4<n<16). Факториал числа это произведение всех чисел от
этого числа до 1. Например 5!=5*4*3*2*1=120*/

        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число от 4 до 16");
        int a = scn.nextInt();
        int s = a;
        if (a > 4 && a < 16) {
            for (int b = 1; b < a; b++) {
                s = s * b;
            }
            System.out.println("Факториал = " + s);
        } else {
            System.out.println("Неверное число");
        }

        /*3) Напечатайте таблицу умножения на 5. предпочтительно печатать 1 x 5 =
        5, 2 x 5 = 10, а не просто 5, 10 и т. д.*/

       int f = 5;

        System.out.println("Таблица умножения на 5");

        for (int y = 1; y <= 10; y++) {
            int k = y * f;
            System.out.println(y + "*" + f + "=" + k);
    }
        /*4) Выведите на экран прямоугольник из *. Причем высота и ширина
прямоугольника вводятся с клавиатуры. Например ниже представлен
прямоугольник с высотой 4 и шириной 5.*/
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите высоту");
        int height = scr.nextInt();
        System.out.println("Введите ширину");
        int width = sc.nextInt();

        for (int h = 1; h <= height; h++) {
            for (int w = 1; w <= width; w++) {
                if (h == 1 || h == height || w == 1 || w == width) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
