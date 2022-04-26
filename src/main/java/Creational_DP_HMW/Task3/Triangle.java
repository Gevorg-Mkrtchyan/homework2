package Creational_DP_HMW.Task3;

import java.util.Scanner;

public class Triangle implements Shape {
    Scanner scanner = new Scanner(System.in);
    int a;
    int b;
    int c;

    {
        System.out.println("enter param 1 of triangle");
        a = scanner.nextInt();
        System.out.println("enter param 2 of triangle");
        b = scanner.nextInt();
        System.out.println("enter param 3 of triangle");
        c = scanner.nextInt();
    }

    @Override
    public int perimeter() {
        return a + b + c;
    }
}

