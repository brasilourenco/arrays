package com.lourenco;

import java.util.Scanner;

public class Main {
    public static void main(String[] arr) {
        double result = 0;
        Scanner scanner = new Scanner(System.in);
        double[] arrays = new double[5];

        System.out.println("Hello, lets play with Arrays");
        System.out.println("enter your first element: ");
        double input1 = scanner.nextDouble();
        arrays[0] = input1;
        System.out.println("enter your second element: ");
        double input2 = scanner.nextDouble();
        arrays[1] = input2;
        System.out.println("enter your third element: ");
        double input3 = scanner.nextDouble();
        arrays[2] = input3;
        System.out.println("enter your fourth element: ");
        double input4 = scanner.nextDouble();
        arrays[3] = input4;
        System.out.println("enter your fifth element: ");
        double input5 = scanner.nextDouble();
        arrays[4] = input5;

        for (int i = 0; i < arrays.length; i++) {
            result = result + arrays[i];
        }
        System.out.println(result);
    }
}
