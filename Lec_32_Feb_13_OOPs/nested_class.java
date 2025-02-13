package Lec_32_Feb_13_OOPs;

class outer{
    int x;
    static int y;

    // private class
    private class private_class{
        void print(){
            System.out.println("x : " + x);
            System.out.println("y : " + y);
        }
    }

    // nested class inside class
    class inner{
        int a;
        void print(){
            System.out.println("a : " + a);
            System.out.println("x : " + x);
            System.out.println("y : " + y);
        }
    }
    static class static_inner{
        int c;
        void print(){
            System.out.println("c : " + c);
            // System.out.println("x : " + x);
            System.out.println("y : " + y);
        }
    }
    void func(){
        System.out.println("function");
    }
}

public class nested_class {
    public static void main(String[] args) {
        
        // outer.inner = new inner(); // Non-staic member can't be accessed directly
        outer outer_obj = new outer();
        outer.inner inner_obj = outer_obj.new inner();
        inner_obj.a = 10;
        inner_obj.print();

        outer.static_inner inner_obj_static_class = new outer.static_inner();
        inner_obj_static_class.c = 20;
        inner_obj_static_class.print();

        // nested class inside method
        int a = 10;
        class method_nested_class{
            void print(){
                System.out.println("Local class variable");
                System.out.println("a : " + a);
            }
        }
        method_nested_class obj2 = new method_nested_class();
        obj2.print();

        // static class inner_class{
        //      nested class inside methods can't be static
        // }
    }
}
