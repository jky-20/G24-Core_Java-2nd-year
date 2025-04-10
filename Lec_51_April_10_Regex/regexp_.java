package Lec_51_April_10_Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexp_ {
    public static void main(String[] args) {
        
        String str = "Today's date is 10-04-2025";
        String reg = "(\\d{2})-(\\d{2})-(\\d{4})";

        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(str);
        if(m.find()){
            System.out.println(" || " + m.start() + " to " + m.end());
            System.out.println("Date : " + m.group(1));
            System.out.println("Month : " + m.group(2));
            System.out.println("Year : " + m.group(3));
        }

        String replaced = m.replaceAll("Replaced");
        System.out.println(replaced);
    }
}
