package Lec_28_Feb_6_OOPs;

class Mutable{
    int x;
}

final class Immutable{
    final private int a;
    final private int b;
    final private Mutable m;

    Immutable(int a, int b, Mutable m){
        this.a = a;
        this.b = b;
        // this.m = m;     // can be changed due to shallow copy

        this.m = new Mutable();
        this.m.x = m.x;
    }

    int get_a(){
        return this.a;
    }
    int get_b(){
        return this.b;
    }
    Mutable get_m(){
        // return defensive copy of objects
        Mutable temp = new Mutable();
        temp.x = this.m.x; 
        return temp;
    }

    void print(){
        System.out.println("a : " + this.a);
        System.out.println("b : " + this.b);
        System.out.println("m : " + this.m.x);
        System.out.println("-----------------");
    }
}

public class immutable_class {
    public static void main(String[] args) {
        
        Mutable m1 = new Mutable();
        m1.x = 10;

        Immutable im = new Immutable(10, 20, m1);
        im.print();

        m1.x = 30;
        im.print();

        Mutable m2 = im.get_m();
        m2.x = 20;
        im.print();
    }
}
