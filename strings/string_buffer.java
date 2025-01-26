package strings;
public class string_buffer {
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("abdce");
        
        // append
        sb.append("null");
        System.out.println(sb);

        // length
        sb.length();

        // char at index
        sb.charAt(2);

        // set char
        sb.setCharAt(0, 'c');

        // insert
        sb.insert(2,"null");

        // substring
        sb.substring(3);
        sb.substring(3, 7);

        // delete char
        sb.deleteCharAt(3);

        // delete substring
        sb.delete(3, 6);

        // replace substring
        sb.replace(3, 5, "null");

        // convert string buffer to string
        sb.toString();

        // convert string to string buffer
        String str = "hello";
        sb = new StringBuffer(str);
    }
}
