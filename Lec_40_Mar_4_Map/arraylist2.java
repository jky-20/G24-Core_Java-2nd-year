package Lec_40_Mar_4_Map;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist2 {
    public static void main(String[] args) {
        
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(40);
        arrayList.add(30);
        arrayList.add(20);
        arrayList.add(13);
        
        // int max = arrayList.get(0);
        // for(int elem : arrayList){
        //     max = Math.max(max, elem);
        // }

        int max_val = Collections.max(arrayList);
        System.out.println(max_val);
    }
}
