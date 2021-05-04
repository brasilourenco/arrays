package com.lourenco;

import java.util.Scanner;

public class ArrayLogic {

    MyDoubleArray myArray = new MyDoubleArray();
    Scanner scanner = new Scanner(System.in);

    public void logic() {
        while (true) {
            System.out.println("Hello, lets play with arrays!");
            System.out.println("insert your first name: ");
            String i1 = scanner.nextLine();
            myArray.array[0] = i1;
            System.out.println("insert your second name: ");
            String i2 = scanner.nextLine();
            myArray.array[1] = i2;
            System.out.println("insert your third name: ");
            String i3 = scanner.nextLine();
            myArray.array[2] = i3;
            System.out.println("insert your fourth name: ");
            String i4 = scanner.nextLine();
            myArray.array[3] = i4;
            System.out.println("insert your fifth name: ");
            String i5 = scanner.nextLine();
            myArray.array[4] = i5;

            System.out.println(myArray.array[0] + "\n" + myArray.array[1] + "\n" + myArray.array[2] + "\n" + myArray.array[3] + "\n" + myArray.array[4] + "\n" + "\n");

        }
    }
}