package com.Aniken;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//      First option:
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        LinkedList<UniqueStructure> result = new LinkedList<>();

        if (input.length() >= 1) {
            result.add(new UniqueStructure(String.valueOf(input.charAt(0))));
        } else {
            System.out.println("[]");
            System.exit(0);
        }
        for (int i = 1; i < input.length(); i++) {
            String nextLetter = String.valueOf(input.charAt(i));
            UniqueStructure current = result.getLast();
            if (current.getLetter().equals(nextLetter)) {
                current.increment();
            } else {
                result.add(new UniqueStructure(nextLetter));
            }
        }
        System.out.println(result);

//       Second option:
//       String[] input = {"a", "a", "a", "b", "b", "b", "c", "c", "a" };
//       System.out.println(countSameInARow(input));
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
