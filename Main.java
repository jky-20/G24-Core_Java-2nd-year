import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = {10,20,30,40,50};
        for(int i : nums){
            System.out.println(nums[i]);
        }

        String str = "10";
        int a = 6, b = 7;
        System.out.println(str + a + b);

        String str1 = "hello";
        str1.concat("world");
        System.out.println(str1);
        str1 = "def";
        System.out.println(str1);

        str1 = "abcdef";
        String str2 = str1.substring(1,3);
        String str4 = str1.substring(1,6);
        String str3 = str1.substring(1);

        str1 = "abc";
        str2 = "abc";
        String str5 = new String("abc");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
        System.out.println(str1==str5);
        System.out.println(str1.equals(str5));

        for(byte i=0 ; i < 128 ; i++){
            System.out.println(i);
        }

        scanner.close();
    }
}

