package Y2018.Nov.A3th;

import java.util.HashMap;

public class Solution3 {
    public int lengthOfLongestSubStr(String s) {
        HashMap<Character, Integer> characters = new HashMap<>();
        int result = 0;

        for (int i = 0, j = 0; j < s.length(); j++) {
            if (characters.containsKey(s.charAt(j))) {
                i = Math.max(characters.get(s.charAt(j)) + 1, i);
            }

            result = Math.max(result, j - i + 1);
            characters.put(s.charAt(j), j);
        }

        return result;
    }
}
