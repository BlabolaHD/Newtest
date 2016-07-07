package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in, "ISO-8859-2");
        System.out.println("Test polí. Délka pole ");

        System.out.println("Ahoj, poèítám prùmìr známek, kolik známek má¹?");
        int pocet = Integer.parseInt(sc.nextLine());
        int[] cisla = new int[pocet];
        for (int i = 0; i < pocet; i++) {
            System.out.printf("Zadejte %d. èíslo: ", i + 1);
            cisla[i] = Integer.parseInt(sc.nextLine());
        }
        // poèítá prùmìr
        int soucet = 0;
        for (int i: cisla)
            soucet += i;
        float prumer = soucet / (float)cisla.length;

        System.out.printf("Prùmìr tvých známek je: %f", prumer);
        /*
        //for (int j = 1;j <= 10; j++)
        int j = sc.nextInt();
        {
            for (int i = 1; i <= 10; i++)
                System.out.printf("%d ", i * j);
            System.out.println();
        }
        System.out.println("Dìkuji za zadání");
        //test update nn
        */

    }
}
