package Lec_41_Mar_5_Map;

import java.util.HashMap;
import java.util.Scanner;

public class first_non_repeating_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        HashMap<Character,Integer> hmap = new HashMap<>();

        for(int i=0 ; i<str.length() ; i++){
            hmap.put(str.charAt(i), hmap.getOrDefault(str.charAt(i), 0)+1);
        }
        for(int i=0 ; i<str.length() ; i++){
            if(hmap.get(str.charAt(i)) == 1){
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
