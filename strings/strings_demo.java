package strings;
public class strings_demo {
    public static void main(String[] args) {
        
        String str = "Hello";
        str = str.concat(" World");

        System.out.println(str);

        //String methods

        // length
        // str.length();
        System.out.println(str.length());

        // char at
        System.out.println(str.charAt(2));

        // substring
        System.out.println(str.substring(3, 7));
        System.out.println(str.substring(3));

        // compare
        System.out.println(str.equals("Hello"));

        // To upper case
        System.out.println(str.toUpperCase());

        // replace
        System.out.println(str.replace("Hello", "World"));

        // find sequence
        System.out.println(str.contains("Hello"));
    }
}
