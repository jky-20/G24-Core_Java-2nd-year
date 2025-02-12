package Lec_31_Feb_12_OOPs;

interface Animal{
    int a = 10;     // constant by default
    void makes_sound();

    // protected void protected_fun(){
    //     System.out.println("Can't create protected method in Interfaces");
    // }
    private void hello(){
        System.out.println("Hello");
    }
    default void print(){
        hello();
        System.out.println("A default method in Interface");
    }
}

public class interfaces {
    public static void main(String[] args) {
        
        // creating objects of interfaces
        // Animal ex = new Animal();     // can't make objects of interfaces
    }
}
