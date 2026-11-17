import java.util.*;

public class repeatedPattern {
    public static void main(String[] args) {
      String str = "abcabcabc";
      String doubled = str + str;
      System.out.println(doubled.indexOf(str,1) < str.length());
    }
}
