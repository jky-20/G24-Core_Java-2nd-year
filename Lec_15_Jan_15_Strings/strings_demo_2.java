package Lec_15_Jan_15_Strings;
public class strings_demo_2 {
    public static void main(String[] args) {
        
        String str1 = "Hello"; // creates string in string pool
        String str2 = new String("Hello"); // Creates string in thr heap memory

        System.out.println("String 1 : " + str1);
        System.out.println("String 2 : " + str2);
        
        // compare
        System.out.println(str1.equals(str2));
        
        System.out.println(str1==str2);

        String str3 = "Hello";

        System.out.println(str1==str3);

        String a = new String("abcd");
        String b = new String("abcd");
        System.out.println("Comparing a and b using == : " + (a == b));
    }
}
