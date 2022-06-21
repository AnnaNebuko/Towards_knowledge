package com.Aniken;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    //Input: nums = [2,7,11,15], target = 9
    //Output: [0,1]

    public static void main(String[] args) {
        int[] nums = {3, 3, 11, 15};
        int target = 6;
        System.out.println(Arrays.toString(bruteForce(nums, target)));
    }

    //Remember:
    //When asked to find the index of something, put the index in place of the value in Map
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        int[] answer = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                answer[0] = i;
                answer[1] = hashMap.get(target - nums[i]);
                break;
            } else {
                hashMap.put(nums[i], i); // 2, 0
            }
        }
        return answer;
    }

    //Remember:
    // j = i + 1
    public static int[] bruteForce(int[] nums, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }
}
