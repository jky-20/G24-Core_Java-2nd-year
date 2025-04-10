package Lec_51_April_10_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class find_quoted_words {
    public static void main(String[] args) {
        String str = "word of the day is \"Hello\" and \"Mate\".";
        String reg = "\"\\w*\"";

        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(str);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
