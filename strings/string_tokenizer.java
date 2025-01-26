package strings;
import java.util.StringTokenizer;

public class string_tokenizer {
    public static void main(String[] args) {
        
        String str = "My name is Jai";
        StringTokenizer st = new StringTokenizer(str);

        str = "apple;mango;banana";
        st = new StringTokenizer(str, ";");

        // total tokens
        System.out.println(st.countTokens());

        // print all tokens
        while (st.hasMoreTokens()) { // check if more tokens are present
            System.out.println(st.nextToken()); // prints next token
        }
    }
}
