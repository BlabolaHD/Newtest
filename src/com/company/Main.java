package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in, "ISO-8859-2");
        System.out.println("Zadejte èíslo k umocnìní.");
        //int a = Integer.parseInt(sc.nextLine()); wwwwwwww1
        float a = sc.nextFloat();
        if (a > 0)
        {
            System.out.println("Zadal jsi èíslo vìt¹í ne¾ 0, mohu umocnit!");
            double b = Math.sqrt(a);
            System.out.println("Výsledek z èísla je: " + a + " je " + b);
        }
        else
            System.out.println("Nelze!");
        //float b = a * a;
        System.out.println("Dìkuji za zadání");
        //test update nn
    }
}
