package org.example;

import java.util.HashSet;

public class Encryption {
    public String crypt(Integer numberOfPeople, String [][] data) {

        for (int i = 0; i < numberOfPeople; i ++) {

            String[] line = data[i];
            //=======================Amount of letters=======================
            String fio = String.join(",", line[0], line[1], line[2]);
            //System.out.println(fio);
            HashSet<Character> uniqueLetters = new HashSet<>();
            for (int j = 0; j < fio.length(); j++) {
                uniqueLetters.add(fio.charAt(j));
            }
            int numberOfUniqueLetters = uniqueLetters.size() - 1;
            //=======================Amount of letters=======================

            //=======================Sum of day and month====================
            String dayAndMoth = String.join(",", line[3], line[4]);
            dayAndMoth = dayAndMoth.replace(",", "");
            dayAndMoth = dayAndMoth.replace(" ", "");
            int sum = dayAndMoth.chars()
                .map(Character::getNumericValue)
                .sum();
            sum = sum * 64;
            //=======================Sum of day and month====================

            //=======================First surname letter====================
            String alphabet = "abcdefghijklmnopqrstuvwxyz";
            int indexInAlphabet256 = (alphabet.indexOf(line[0].toLowerCase().charAt(0)) + 1) * 256;
            //===============================================================

            int sumOfThree = numberOfUniqueLetters + sum + indexInAlphabet256;
            String hex = Integer.toHexString(sumOfThree).toUpperCase();
            StringBuilder sb = new StringBuilder(hex);
            while (sb.length() <= 3) {
                sb.insert(0, 0);
            }
            System.out.print(hex.substring(hex.length() - 3) + " ");
        }
        return null;
    }
}
