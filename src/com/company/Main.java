package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in, "ISO-8859-2");
        System.out.println("Zadejte ��slo n�sobilky.");
        int j = sc.nextInt();

        for (;j <= 10; j++)
        {
            for (int i = 1; i <= 10; i++)
                System.out.printf("%d ", i * j);
            System.out.println();
        }
        System.out.println("D�kuji za zad�n�");
        //test update nn
    }
}
