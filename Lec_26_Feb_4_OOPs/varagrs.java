package Lec_26_Feb_4_OOPs;

public class varagrs {
    static void print(int... a){
        for(int i : a){
            System.out.print(i + "  ");
        }
        System.out.println();
    }
    // static void print(int... a, int... b){}  // can't contain multiple varags 

    static void print(String a, int... b){  // can overload by adding arguments type
        System.out.println("Overloaded varargs function");
    }
    static void print(long a, int... b){}
    // static void print(int a, int... b){}

    // static void print(int... a, String b){}     // var args must be last parameter
    public static void main(String[] args) {
        
        print(1,2,3);
        print(1,2,3,4,5,6,7);

        int[] a = {1,2,3,4,5};
        print(a);
    }
}
