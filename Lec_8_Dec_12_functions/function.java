package Lec_8_Dec_12_functions;
public class function {

    static int temp = 10;
    public static void main(String[] args) {
        
        int a = 10;
        int b = 20;
        // int temp = 10;
        int ans = sum(a,b);
        // System.out.println(ans);
        System.out.println(a);
        System.out.println(b);
        fibonacci(5);
    }

    static int fibonacci(int n){
        if(n == 1){
            // System.out.println("0");
            return 0;
        }
        if(n == 2){
            // System.out.println("1");
            return 1;
        }

        int n_term = fibonacci(n-1) + fibonacci(n-2);
        // System.out.println(n_term);
        return n_term;
    }

    static void swap(int a, int b){
        System.out.println(temp);
        int t = b;
        b = a;
        a = t;
    }
    static int sum(int a, int b){
        int sum_num = a + b;
        return sum_num;
    }
}
