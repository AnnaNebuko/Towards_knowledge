package com.Aniken;

public class Main {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 5, 6, 6};
        int k = 4;
        System.out.println(Solution.countKDifference(array, k));
    }
}

class Solution {

    public static int countKDifference(int[] nums, int k) {

        int counter = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] - nums[j] == k ||
                    nums[j] - nums[i] == k) {
                    counter++;
                }

            }
        }
        return counter;
    }
}