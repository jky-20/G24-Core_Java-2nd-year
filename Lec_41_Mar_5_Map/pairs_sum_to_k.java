package Lec_41_Mar_5_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class pairs_sum_to_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer,Integer> hmap = new HashMap<>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        for(int i=0 ; i<n ; i++){
            int a = sc.nextInt();
            arr.add(a);
            hmap.put(a, hmap.getOrDefault(a, 0)+1);
        }
        int count = 0;
        for(int i=0 ; i<arr.size() ; i++){
            int a = arr.get(i);
            if(!hmap.containsKey(a)){
                continue;
            }
            if(!hmap.containsKey(k-a)){
                hmap.remove(a);
                continue;
            }
            if(k-a == a){
                int freq = hmap.get(a);
                count += ((freq * (freq-1)) / 2);
                hmap.remove(a);
                continue;
            }
            int freq1 = hmap.get(a);
            int freq2 = hmap.get(k-a);
            count += (freq1 * freq2);
            hmap.remove(a);
            hmap.remove(k-a);
        }
    }
}
