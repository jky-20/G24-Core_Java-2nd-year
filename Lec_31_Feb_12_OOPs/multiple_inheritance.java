package Lec_31_Feb_12_OOPs;

// in case of Classes
class A{
    int a;
}
class B{
    int b;
}

// class C extends A, B{   // Classes doesn't support multiple inheritance
//     int c;
// }

// In Interfaces
interface W{
    void print();
    default void func(){
        System.out.println("Interface W");
    }
}
interface X extends W{
    void print();
    // default void func(){
    //     System.out.println("Interface X");
    // }
}
interface Y extends W{
    void print();
    default void func(){
        System.out.println("Interface Y");
    }
}
interface Z extends X, Y{   // Multiple inheritance and Case of diamond problem
    void print();
    // default void func(){
    //     System.out.println("Interface Z");
    // }
}
class C implements X, Y{
    public void print(){
        System.out.println("Multiple inheritance");
    }
    void function(){
        // X.super.func();  // If present in just above parent then call that function
        Y.super.func();
    }
}

public class multiple_inheritance {
    public static void main(String[] args) {
        
    }
}
