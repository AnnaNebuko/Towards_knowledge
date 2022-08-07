package org.anniken;

public class Solution {

    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 0) {
            return "";
        }

        //Treat the whole first word as a prefix
        String prefix = strs[0];

        //This looks at word by word from second one
        for (int i = 1; i < strs.length; i++) {
            String currentWord = strs[i];
            int index = 0;

            while (index < prefix.length() && index < currentWord.length() &&
                currentWord.charAt(index) == prefix.charAt(index)) {

                index++;
            }

            if (index == 0) {
                return "";
            }
            prefix = prefix.substring(0, index);
        }
        return prefix;
    }
}
