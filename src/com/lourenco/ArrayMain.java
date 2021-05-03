package com.lourenco;

public class ArrayMain {
    public static void main(String[] args) {
        MyDoubleArray myArray = new MyDoubleArray(10);
        myArray.addName("Alfredo");
        myArray.addName("Lourenco");
        myArray.addName("Pedro");
        myArray.addName("Rosa");
        myArray.addName("João");
        myArray.addName("Carlos");
        myArray.addName("Rodrigo");
        myArray.addName("Mário");
        myArray.addName("Gonçalo");
        myArray.addName("José");

        myArray.removeName(9);
        myArray.removeName(8);
        myArray.removeName(7);
        myArray.removeName(6);
        myArray.removeName(5);
        myArray.removeName(4);
        myArray.removeName(3);
        myArray.removeName(2);
        myArray.removeName(1);
        myArray.removeName(0);

        for (int i = 0; i < myArray.getArray().length; i++) {
            System.out.println(myArray.getArray()[i]);
        }
    }
}
