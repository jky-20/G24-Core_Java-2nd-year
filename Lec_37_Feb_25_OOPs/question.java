package Lec_37_Feb_25_OOPs;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class KeyValue{
    int key;
    int val;
    KeyValue(int key, int val){
        this.key = key;
        this.val = val;
    }
    @Override
    public String toString(){
        return ("Key : " + key + " || Value : " + val);
    }
}
// class SortByValue implements Comparator<KeyValue>{
//     @Override
//     public int compare(KeyValue kv1, KeyValue kv2){
//         return Integer.compare(kv2.val, kv1.val);
//     }
// }

public class question {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        ArrayList<KeyValue> arrList = new ArrayList<>();
        KeyValue[] arr = new KeyValue[n];

        for(int i=0 ; i<n ; i++){
            int key = sc.nextInt();
            int val = sc.nextInt();
            arr[i] = new KeyValue(key, val);
            arrList.add(new KeyValue(key, val));
        }

        // using Lamda expression
        Collections.sort(arrList, (kv1, kv2)->Integer.compare(kv2.val, kv1.val));
        arrList.sort((kv1, kv2)->Integer.compare(kv2.val, kv1.val));
        Arrays.sort(arr, (kv1, kv2)->Integer.compare(kv2.val, kv1.val));

        System.out.println("-------------------ArrayList---------------");
        for(KeyValue kv : arrList){
            System.out.println(kv);
        }
        System.out.println("-------------------Array---------------");
        for(KeyValue kv : arr){
            System.out.println(kv);
        }

        // using Anonymous class
        arrList.sort(new Comparator<KeyValue>() {
            public int compare(KeyValue kv1, KeyValue kv2){
                return Integer.compare(kv2.val, kv1.val);
            }
        });
    }
}
