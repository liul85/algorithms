package Y2018.Nov.A3th;

import java.util.ArrayList;

public class Solution {
    public int lengthOfLongestSubStr(String s) {
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            ArrayList<Character> tempSubStr = new ArrayList<>();
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                if (!tempSubStr.contains(c)) {
                    tempSubStr.add(c);
                } else {
                    break;
                }
            }

            if (tempSubStr.size() > maxLength) {
                maxLength = tempSubStr.size();
            }
        }

        return maxLength;
    }
}
