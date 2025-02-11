package Lec_30_Feb_11_OOPs;

interface Animal{
    int a = 10;
    void makes_sound();
    // constructor
    // Animal(){
    //     System.out.println("Interfaces can't have constructors");
    // }

    default void print(){
        System.out.println("A default method in Interface");
    }
}

interface Dog extends Animal{

}

class Cat implements Animal{
    @Override
    public void makes_sound(){      // scope in interface is public implicitly
        System.out.println("Cat meows");
    }
}

public class interfaces {
    public static void main(String[] args) {
        
        // creating objects of interfaces
        // Animal ex = new Animal();     // can't make objects of interfaces
    }
}
