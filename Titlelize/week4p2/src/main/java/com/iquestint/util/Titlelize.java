package com.iquestint.util;

import java.util.Arrays;

public class Titlelize implements Titlelizer {
    private String[] wordsToIgnore = new String[]{"the", "a", "to", "in", "of", "is"};

    private String[] stringToArray(String phrase) {
        return phrase.split(" ");
    }

    private boolean checkIfWordExists(String word) {
        boolean exists = false;
        for (String smallWord : wordsToIgnore) {
            if (smallWord.equals(word)) {
                exists =  true;
            }
        }
        return exists;
    }

    public String titlelize(String toTitlelize) {
        if (toTitlelize == null)
            throw new IllegalArgumentException();

        if (toTitlelize.equals(""))
            return "";

        String[] arr = stringToArray(toTitlelize);
        int index = 0;
        for (String word : arr) {
            if(checkIfWordExists(word)) {
                arr[index] = word;
                index++;
                continue;
            }
            arr[index] = word.substring(0, 1).toUpperCase() + word.substring(1);
            index++;
        }
        return Arrays.toString(arr).replaceAll("\\[|\\]|,|", "");
    }
}
