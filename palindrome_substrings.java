import java.util.Scanner;

public class palindrome_substrings{

    static boolean check_palindrome(String str){
        for(int si=0 , ei=str.length()-1 ; si < ei ; si++, ei--){
            if(str.charAt(si) != str.charAt(ei)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        // basic approach
        int cnt = 0;
        for(int i=0 ; i<str.length()-1 ; i++){
            for(int j=i+1 ; j<str.length() ; j++){
                if(check_palindrome(str.substring(i, j))){
                    cnt++;
                }
            }
        }
        System.out.println("No. of Palindrome Substrings are : " + cnt);
    }
}