package Lec_22_Jan_28_OOPs;

class car {
    private String brand;
    private String color;
    int speed;

    // car(){  // user made default constructor
    //     brand = "";
    //     color = "white";
    //     speed = 60;
    // }
    car(String brand, String color, int speed){
        this.brand = brand;
        this.color = color;
        this.speed = speed;

        // this.print();
    }

    String getBrand(){
        return this.brand;
    }

    void setColor(String color){
        this.color = color;
    }

    String getColor(){
        return this.color;
    }

    void print(){
        System.out.println("Brand : " + brand);
        System.out.println("Color : " + color);
        System.out.println("Speed : " + speed);
    }

}

public class encapsulation {
    public static void main(String[] args) {
        
        car car1 = new car("Fortuner", "Black", 120);
        // car1.brand = ""; invalid due to private member

        car1.setColor("White");
        System.out.println(car1.getColor());

    }
}
