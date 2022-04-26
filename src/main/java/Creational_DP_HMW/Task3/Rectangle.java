package Creational_DP_HMW.Task3;

import java.util.Scanner;

public class Rectangle implements Shape {
    Scanner scanner = new Scanner(System.in);
    int w;
    int h;

    {
        System.out.println("enter param 1 of rectangle");
        w = scanner.nextInt();
        System.out.println("enter param 2 of rectangle");
        h = scanner.nextInt();
    }

    @Override
    public int perimeter() {
        return 2 * (w + h);
    }
}
