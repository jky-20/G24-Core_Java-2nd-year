package Lec_33_Feb_17_OOPs;

interface A{
    // int a;   // interface have constant by default
    int a = 10;

    // A(){     // don't have constructors in interface
    //     a = 10;
    // }

    void display();
}

// class B extends A{      // class implements interface , not extends
class B implements A{    
    // void display(){     // access modifier will be public as interface has public access modifier
    public void display(){    
        System.out.println("Hello");
    }
}

public class question2 {
    public static void main(String[] args) {
        
    }
}
