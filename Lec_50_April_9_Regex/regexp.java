package Lec_50_April_9_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexp {
    public static void main(String[] args) {
        
        System.out.println(Pattern.matches("[abc]{2}", "baaa"));
        System.out.println(Pattern.matches("[abc]{2,}", "baaa"));
        System.out.println(Pattern.matches("[abc]{3,7}", "baaa"));

        String regexpString = "\\d+";
        String str = "Today is 09-04-2025 next year is 2026";

        Pattern p = Pattern.compile(regexpString);
        Matcher m = p.matcher(str);

        while(m.find()){
            System.out.println("year: " + m.group());
        }

    }
}
