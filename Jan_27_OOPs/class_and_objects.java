package Jan_27_OOPs;

class car {
    String brand;
    String color;
    int speed;

    car(){  // user made default constructor
        brand = "";
        color = "white";
        speed = 60;
    }
    car(String b, String c, int s){
        brand = b;
        color = c;
        speed = s;
    }

    void print(){
        System.out.println("Brand : " + brand);
        System.out.println("Color : " + color);
        System.out.println("Speed : " + speed);
    }

    static void display(){
        System.out.println("A static method");
        // System.out.println(brand);  // access non static data member

        // access non-static data member
        car temp = new car();
        System.out.println(temp.brand);
    }
}

public class class_and_objects {
    public static void main(String[] args) {
        
        car car1 = new car();
        car1.brand = "kia";
        car1.color = "black";
        car1.speed = 100;
        car1.print();

        car car2 = new car("skoda", "white", 110);
        car2.print();
        car.display();
    }
}
