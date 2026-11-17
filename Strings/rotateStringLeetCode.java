import java.util.*;
class Solution {
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }
}

public class rotateStringLeetCode {
    public static void main(String[] args) {
      Solution s = new Solution();
      System.out.println(s.rotateString("abcde","abced"));
    }
}
