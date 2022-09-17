package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int [] arr = {0,1,0,3,12};
        System.out.println(Arrays.toString(solution.moveZeroes(arr)));
        //arr must be [1 3 12 0 0]
    }
}