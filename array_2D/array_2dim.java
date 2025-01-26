package array_2D;
import java.util.Scanner;

public class array_2dim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int[][] arr = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[4];
        arr[2] = new int[2];

        // for(int i=0 ; i<n ; i++){
        //     int col = sc.nextInt();
        //     arr[i] = new int[col];
        // }

        // input and print 2-D array

        for(int i=0 ; i < arr.length ; i++){

            for(int j=0 ; j< arr[i].length ; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length ; j++){
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }

    }
}
