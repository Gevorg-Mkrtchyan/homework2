package Creational_DP_HMW.Task3;

import java.util.Scanner;

public class Circle implements Shape {
    Scanner scanner = new Scanner(System.in);
    int r;

    {
        System.out.println("enter param of circle");
        r = scanner.nextInt();
    }

    @Override
    public int perimeter() {
        return (int) (2 * Math.PI * r);
    }
}
