package org.example;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean isPalindrome(int x) {
        //===Convert an integer to an array of digits===
        List<Integer> array = new ArrayList<>();
        do {
            int temp = x % 10;
            x /= 10;
            if (x != 0) {
                temp = Math.abs(temp);
            }
            array.add(temp);
        } while (x != 0);
        //==============================================
        if (array.size() == 1 && array.get(0) < 0) {
            return false;
        }

        int forward = 0;
        int backward = array.size() - 1;

        while (backward > forward) {
            int a = array.get(forward++);
            int b = array.get(backward--);
            if (a != b) {
                return false;
            }
        }
        return true;
    }
}
