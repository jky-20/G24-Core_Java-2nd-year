package Lec_52_April_17_Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class words_with_first_caps {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String reg = "\\b[A-Z]\\w*\\b";
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(str);

        while(m.find()){
            System.out.println(m.group());
        }
    }
}
