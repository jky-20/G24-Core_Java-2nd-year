package Lec_40_Mar_4_Map;

import java.util.HashMap;

public class hashmap {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,-1,-2,-3,1,2,4,3,-1,-2};
        HashMap<Integer,Integer> hmap = new HashMap<>();

        for(int elem : arr){
            // if(hmap.containsKey(elem)){
            //     hmap.put(elem, hmap.get(elem)+1);
            // }
            // else{
            //     hmap.put(elem, 1);
            // }
            hmap.put(elem, hmap.getOrDefault(elem, 0)+1);
        }
        // traverse map
        for(var entry : hmap.entrySet()){
            System.out.println("Key : " + entry.getKey() + " || value : " + entry.getValue());
        }

        for(var key : hmap.keySet()){
            System.out.println(key + " || " + hmap.get(key));
        }
        for(var val : hmap.values()){
            // gives all values list
        }
    }
}
