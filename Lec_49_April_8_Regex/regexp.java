package Lec_49_April_8_Regex;

import java.util.regex.Pattern;

public class regexp {
    public static void main(String[] args) {
        
        System.out.println(Pattern.matches("[abc]", "b"));
        System.out.println(Pattern.matches("[^ac]", "b"));
        System.out.println(Pattern.matches("[a-i]", "o"));
        System.out.println(Pattern.matches("[abc]?", "b"));
        System.out.println(Pattern.matches("[abc]?", ""));
        System.out.println(Pattern.matches("[abc]?", "ba"));
        System.out.println(Pattern.matches("[abc]+", "bacba"));
        System.out.println(Pattern.matches("[abc]*", "bacba"));
        System.out.println(Pattern.matches("[abc]+", "bbbbb"));
        System.out.println(Pattern.matches("[abc]*", "baaa"));
        System.out.println(Pattern.matches("[abc]{2}", "baaa"));
        System.out.println(Pattern.matches("[abc]{2,}", "baaa"));
        System.out.println(Pattern.matches("[abc]{3,7}", "baaa"));
    }
}
