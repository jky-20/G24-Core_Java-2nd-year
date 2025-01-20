import java.util.Scanner;

public class print_all_substrings {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        // all substrings starting from any particular index
        for(int i=0 ; i<str.length() ; i++){
            for(int j=i+1 ; j<=str.length() ; j++){
                System.out.println(str.substring(i, j));
            }
        }

        // all substrings ending at any particular index
        for(int endi = 1 ; endi <= str.length() ; endi++){
            for(int starti = 0 ; starti < endi ; starti++){
                System.out.println(str.substring(starti, endi));
            }
        }

    }
}
