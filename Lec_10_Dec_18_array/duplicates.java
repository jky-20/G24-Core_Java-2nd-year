package Lec_10_Dec_18_array;
import java.util.Scanner;

public class duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n+3];

        for(int i=1 ; i<=n+2 ; i++){
            arr[i] = sc.nextInt();
        }

        for(int i=1 ; i<=n+2 ; i++){
            arr[Math.abs(arr[i])] *= -1;
        }

        for(int i=1 ; i<=n ; i++){
            if(arr[i] >0){
                System.out.println(i);
            }
        }
    }
}
