package org.example;

public class Solution {

  // Dynamic programming - solving complex problems by breaking them down
  // into simpler subtasks
  public int climbStairs(int n) {

    //steps = collects number of steps for each stage, starting from bottom
    int[] steps = new int[n + 1];

    // Only 1 way to get 0 and 1 step
    steps[0] = 1;
    steps[1] = 1;

    for (int i = 2; i <= n; i++) {
      steps[i] = steps[i - 1] + steps[i - 2];
    }
    return steps[n];
  }

  //steps [1, 1, 2, 3, 5, 8, 13, 21, 34, 55]
}
