package Lec_26_Feb_4_OOPs;

public class compile_time_polymorphism {

    static int add(int a){
        return 10;
    }
    static int add(long a){     // overload by changing data type
        return 10;
    }
    static int add(int a, int b){
        return a + b;
    }
    static int add(int a, int b, int c){    // overloading by changing no. of arguments
        return a + b + c;
    }
    static int add(String a, int b){    // overloading by changing arguments type
        return 10;
    }
    static int add(int b, String a){    // overloading by changing arguments order
        return 20;
    }
    // static String add(int a, String b){  // can't overload by changing return type
    //     return "10";
    // }
    // static int add(int a, String b){    // can't overload by changin arguments name
    //     return 20;
    // }

    public static void main(String[] args) {
        
        int a = 10;
        System.out.println(add(a));
    
        System.out.println(add(10));

        System.out.println(add(10, 20));
        
        System.out.println(add(10, 20, 30));

        System.out.println(add("abc", 2));
        System.out.println(add(2, "abc"));
    }
}
