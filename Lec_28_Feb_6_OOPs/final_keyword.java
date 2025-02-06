package Lec_28_Feb_6_OOPs;

final class parent{
    String name;
}

// class child extends parent{     // can't inherit final class
//     int age;
// }

class pair{
    int a;
    int b;
}

public class final_keyword {
    public static void main(String[] args) {
        
        final int a = 10;
        // a = 20;     // final variable can't be modfied

        final int b;
        b = 20;     // intialization
        // b = 30;

        // creating obj of final class
        parent p1 = new parent();
        p1.name = "Jai";
        p1.name = "JKY";

        // creating final objects
        final pair pair1 = new pair();
        pair1.a = 1;
        pair1.a = 2;
        // pair1 = new pair(); // can't reassign final objects
    }
}
