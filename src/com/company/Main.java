package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in, "ISO-8859-2");
        System.out.println("Zadejte ��slo k umocn�n�.");
        //int a = Integer.parseInt(sc.nextLine()); wwwwwwww1
        float a = sc.nextFloat();
        if (a > 0)
        {
            System.out.println("Zadal jsi ��slo v�t�� ne� 0, mohu umocnit!");
            double b = Math.sqrt(a);
            System.out.println("V�sledek z ��sla je: " + a + " je " + b);
        }
        else
            System.out.println("Nelze!");
        //float b = a * a;
        System.out.println("D�kuji za zad�n�");
        //test update nn
    }
}
