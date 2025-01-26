package strings;
import java.util.Scanner;

public class stringBuilder {
    public static void main(String[] args) {
        
        StringBuilder str = new StringBuilder("Hello");
        StringBuilder str2 = new StringBuilder("abc");
        // length
        System.out.println(str.length());

        // append
        str.append(" str");
        System.out.println(str);

        // char at index
        str.charAt(2);

        System.out.println(str.deleteCharAt(2));

        // insert
        str.insert(2, 'a');
        str.insert(2, "abc");

        //set char
        str.setCharAt(2, 'a');

        //compare
        str.equals(str2);

        // substring
        System.out.println(str.substring(2));
        System.out.println(str.substring(3, 7));

        // reverse
        System.out.println(str.reverse());

        // delete substring
        System.out.println(str.delete(1, 3));

        // replace substring
        StringBuilder sb = new StringBuilder("abcdef");
        sb.replace(1, 4, "abcdef");
        System.out.println(sb);

        // converts string-builder to string
        str.toString();

        // convert string to string-builder
        String s = "abc";
        sb = new StringBuilder(s);

        // input a string-builder

        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        StringBuilder sb1 = new StringBuilder(st);
    }
}
