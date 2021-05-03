package com.lourenco;

public class MyDoubleArray {
    private String[] array;

    public MyDoubleArray(int arraySize) {
        array = new String[arraySize];
    }

    public String[] getArray() {
        return array;
    }

    public void addName(String item) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = item;
                return;
            }
        }
    }

    public void removeName(int i) {
        if (array[i] != null) {
            array[i] = null;
        }
    }
}

