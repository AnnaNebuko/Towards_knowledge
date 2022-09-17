package org.example;

public class Solution {
    public int[] moveZeroes(int[] nums) {
        int count = 0; // we must know how much non-zero numbers in array

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[count++] = nums[i]; // Put non-zero numbers in the same array
            }
        }
        while (count < nums.length) {
            nums[count++] = 0;
        }
        return nums;
    }
}
