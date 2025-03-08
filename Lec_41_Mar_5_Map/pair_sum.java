package Lec_41_Mar_5_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class pair_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0 ; i<n ; i++){
            arrayList.add(sc.nextInt());
        }

        HashMap<Integer,Boolean> hmap = new HashMap<>();
        for(int i=0 ; i<n ; i++){
            if(hmap.containsKey(k - arrayList.get(i))){
                System.out.println("(" + (k-arrayList.get(i)) + "," + arrayList.get(i) + ")");
                break;
            }
            else{
                hmap.put(arrayList.get(i), true);
            }
        }
    }
}
