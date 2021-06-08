package com.annet.corporation;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,6,6};
        System.out.println(countPairs(arr));
    }

    private static int countPairs(int[] arr){
        Arrays.sort(arr);
        int countPairRepetitions = 0;
        int i = 0;
        int currentNumber;

        while (i < arr.length) {
            int countOneNumberRepetitions = 1;//Сброс на 1 на каждой новой цифре
            currentNumber = arr[i]; //Нужно апдейтить, чтобы поспевать за индексам
            i++;

            while (i < arr.length && currentNumber == arr[i]) {
                countOneNumberRepetitions++;
                i++; //чтобы считать третье, четветое и тд. повторение
            }
            if (countOneNumberRepetitions>=2)
                countPairRepetitions += countOneNumberRepetitions/2;
        }
        return countPairRepetitions;
    }
}
