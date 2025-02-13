package Lec_32_Feb_13_OOPs;

interface A{
    void print();
}
abstract class C{
    abstract void print();
}

public class anonymous_class {
    public static void main(String[] args) {
        
        // anonymous class from interface
        A obj = new A() {
            public void print(){
                System.out.println("I'm anonymous class");
            }
        };
        obj.print();

        // anonymous class from abstract class
        C obj1 = new C() {
            void print(){
                System.out.println("Anonymous class");
            }
        };
        obj1.print();
    }
}
