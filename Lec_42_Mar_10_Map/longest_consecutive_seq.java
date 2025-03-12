package Lec_42_Mar_10_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class longest_consecutive_seq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        HashMap<Integer,Boolean> hmap = new HashMap<>();

        // take input and store in map
        int n = sc.nextInt();
        for(int i=0 ; i<n ; i++){
            int a = sc.nextInt();
            arrayList.add(a);
            hmap.put(a, true);
        }

        int maxLen = 0;
        // traverse array to find longest sequence
        for(int i=0 ; i<arrayList.size() ; i++){
            if(!hmap.containsKey(arrayList.get(i))){
                continue;
            }
            int cnt = 1;
            int left = arrayList.get(i) - 1;
            while (hmap.containsKey(left)) {
                cnt++;
                hmap.remove(left);
                left--;
            }
            int right = arrayList.get(i) + 1;
            while (hmap.containsKey(right)) {
                cnt++;
                hmap.remove(right);
                right++;
            }
            maxLen = Math.max(maxLen, cnt);
        }
        System.out.println("Max length of consecutive sequence is " + maxLen);
    }
}
