package Lec_46_Mar_18_ExpHandling;

import java.util.Scanner;

public class while_tryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b;
        while(true){
            try{
                b = sc.nextInt();
                System.out.println(a / b);
                break;
            }
            catch(ArithmeticException ex){
                System.out.println(ex.getMessage());
                System.out.println("Enter number again");
            }
        }
    }
}
