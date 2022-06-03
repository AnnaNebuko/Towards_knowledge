package com.Aniken;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        String[] input = {"a", "a", "a", "a", "b", "b", "b", "c", "c", "a" };
        System.out.println(countSameInARow(input));
        System.out.println(Arrays.toString(input));
    }

    private static  List<Map <String, Integer>> countSameInARow (String [] input) {
        List<Map <String, Integer>> listOfMap = new ArrayList<>();
        int countRepetitions = 0;
        int i = 0; // index
        String currentLetter; // letter of index

        while (i < input.length) {
            countRepetitions = 1;// New letter already has 1 repetition
            currentLetter = input[i];
            i++; // always ahead to be able to compare with letter of index

            while (i < input.length && Objects.equals(currentLetter, input[i])) {
                countRepetitions++;
                i++; // always ahead!
            }
            Map <String, Integer> map = new HashMap<>();
            map.put(currentLetter, countRepetitions);
            listOfMap.add(map);
        }
        return listOfMap;
    }
}
