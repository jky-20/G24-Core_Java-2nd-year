import java.util.Scanner;

public class good_substr {
    static boolean goodString(String str, int si, int ei){ // abcdef 

        while (si <= ei) {
            if(str.charAt(si)!='a' && str.charAt(si)!='e' && str.charAt(si)!='i' && 
                str.charAt(si)!='o' && str.charAt(si)!='u'){
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int max_len = 0;
        for(int si=0 ; si<str.length() ; si++){
            for(int ei=si ; ei<str.length() ; ei++){
                if(goodString(str, si, ei)){
                    int len = ei - si + 1;
                    if(len > max_len){
                        max_len = len;
                    }
                }
            }
        }
        System.out.println("Lenght of longest good substring is : " + max_len);
    }
}
