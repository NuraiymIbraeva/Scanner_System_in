package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name = "Tom";
        int age = 30;
        float height = 1.7f;
        System.out.printf("Name: %s Age: %d Height: %.2f /n", name, age, height);

        Scanner in = new Scanner(System.in);
        System.out.print("\nВведите ваше имя ");
        String nameOfPerson = in.nextLine();
        System.out.print("\n Положите число");
        int num = in.nextInt();
        System.out.print("\nВаш вес");
        float weight = in.nextFloat();
        System.out.printf("Имя: %s Число: %d Вес: %.2f \n ", nameOfPerson, num, weight);
        in.close();
        //префиксный инкримент
        int  a =8;
        int b = ++a;
        System.out.println(a);
        System.out.println(b);

        //постфиксный инкримент
        int c =8;
        int d =a++;
        System.out.println(c);
        System.out.println(d);

        int j =10;
        int s = 4;
        boolean l = j == b;//false
        boolean w = j ==10;//true
        System.out.println(j);






    }
}

