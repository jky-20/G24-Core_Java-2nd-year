package Lec_16_Jan_16_Strings;
import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String rev = "";

        for(int i=0 ; i<str.length() ; i++){
            rev = str.charAt(i) + rev;
        }
        System.out.println(rev);

        // Time complexity will be O(n^2)
    }
}
