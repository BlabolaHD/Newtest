package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
Scanner sc = new Scanner(System.in, "ISO-8859-2");
        System.out.println("Zadejte ��slo k umocn�n�.");
        //int a = Integer.parseInt(sc.nextLine()); qqqqqqqqq
        int a = sc.nextInt();
        int b = a * a;
        System.out.println("��slo je " + b);

    }
}
