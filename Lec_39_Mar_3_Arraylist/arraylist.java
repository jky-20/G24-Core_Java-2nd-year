package Lec_39_Mar_3_Arraylist;
import java.util.ArrayList;
import java.util.*;

public class arraylist {
    public static void main(String[] args) {
        
        // List<Integer> arr = new ArrayList<>();  // also a valid syntax
        ArrayList<Integer> arrayList = new ArrayList<>();

        // add element to list
        arrayList.add(10);
        arrayList.add(20);

        arrayList.add(1, 30);
        System.out.println(arrayList);
        // arrayList.add(5, 20);    // index out of bound error
        System.out.println(arrayList);

        // access element
        arrayList.get(2);

        // size of list
        arrayList.size();

        // replace 
        arrayList.set(2, 5);

        arrayList.remove(2);    // removes element from index
        arrayList.contains(10);     // check if object is present or not

        Collections.sort(arrayList);

        // convert to string
        String str = arrayList.toString();

        // convert to array
        Object[] arr = arrayList.toArray(); // convert to general object array
        Integer[] arr2 = arrayList.toArray(new Integer[0]); // to particular object type array
        
        // to primitive type array
        int[] int_arr = arrayList.stream().mapToInt(Integer::intValue).toArray();

        // convert array to list
        Integer[] arr3 = {1,2,3,4,5};
        List<Integer> list = Arrays.asList(arr3);

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr3));
    }
}
