import java.util.Scanner;

public class duplicate_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n+1];

        for(int i=0 ; i<=n ; i++){
            arr[i] = sc.nextInt();
        }

        int sum_val = (n*(n-1))/2;

        int arr_sum = 0;
        for(int val : arr){
            arr_sum += val;
        }
        int ans = arr_sum - sum_val;

        System.out.println(ans);
    }
}
