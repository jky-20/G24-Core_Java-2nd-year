package Lec_35_Feb_19_OOPS;

public class wrapper_class {
    public static void main(String[] args) {
        
        Integer a = new Integer(10);
        Integer b = 10;
        System.out.println(Integer.min(a, b));
        System.out.println(Integer.max(a, 10));

        String str = "12345";
        int c = Integer.parseInt(str);  // converts string to integer
        System.out.println(c);

        str = "101010";
        int decimal = Integer.parseInt(str, 2); // converts binary string to decimal
        System.out.println("Decimal value of " + str + " is : " + decimal);

        str = Integer.toBinaryString(10);   // converts decimal to binary string

        str = Integer.toString(12345);  // converts decimal to string

        char ch = 'a';
        if(Character.isLetter(ch)){
            System.out.println("ch is a letter");
        }
        else if(Character.isLowerCase(ch)){
            System.out.println("ch is in range a - z");
        }
        else if(Character.isUpperCase(ch)){
            System.out.println("ch is in range A - Z");
        }
    }
}
