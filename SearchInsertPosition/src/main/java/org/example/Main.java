package org.example;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1,3,5,6};
        System.out.println(solution.searchInsert(arr, 2));
        System.out.println(solution.binarySearch(arr, 2));
    }
}