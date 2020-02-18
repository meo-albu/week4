package com.iquestint.ju;

import java.util.Arrays;

public class StringList implements List {

    private int[] intArray;
    private int arrayCapacity;
    private int index = 0;

    public StringList() {
        arrayCapacity = 1;
        intArray = new int[arrayCapacity];
    }

    private int stringToInteger(String string) {
        return Integer.parseInt(string);
    }

    private void updateCapacity(int capacity) {
        intArray = Arrays.copyOf(intArray, capacity);
    }

    public void add(Object element) throws CustomException {
        if (element == null) {
            throw new CustomException("Null");
        }
        try {
            updateCapacity(arrayCapacity);
            arrayCapacity++;
            intArray[index] = stringToInteger((String) element);
            index++;
        } catch (NumberFormatException e) {
            throw new CustomException("Invalid number.");
        }
    }

    public Object get(int position) throws CustomException {
        if(position > intArray.length - 1) {
            throw new CustomException("Index out of bounds.");
        }
        return Integer.toString(intArray[position]);
    }

    public boolean contains(Object element) {
        boolean checkIfExists = false;
        for (int number : intArray) {
            if(Integer.parseInt((String) element) == number) {
                checkIfExists = true;
                break;
            }
        }
        return checkIfExists;
    }

    public boolean containsAll(List foreignList) throws CustomException {
        for (int i = 0; i < foreignList.size(); i++) {
            if(!contains(foreignList.get(i))) {
                return false;
            }
        }
        return true;
    }

    public int size() {
        int sizeIndex = 0;
        for (int ignored : intArray)
            sizeIndex++;
        return sizeIndex;
    }
}
