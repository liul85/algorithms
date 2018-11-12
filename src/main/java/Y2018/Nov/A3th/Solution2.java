package Y2018.Nov.A3th;

import java.util.HashSet;

public class Solution2 {
    public int lengthOfLongestSubStr(String s) {
        HashSet<Character> characters = new HashSet<>();
        int slideWindowLeft = 0, slideWindowRight = 0, result = 0;
        while (slideWindowLeft < s.length() && slideWindowRight < s.length()) {
            if (!characters.contains(s.charAt(slideWindowRight))) {
                characters.add(s.charAt(slideWindowRight));
                slideWindowRight++;
                result = Math.max(result, slideWindowRight - slideWindowLeft);
            } else {
                characters.remove(s.charAt(slideWindowLeft));
                slideWindowLeft++;
            }
        }
        return result;
    }
}
