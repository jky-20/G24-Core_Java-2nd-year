package Jan_28_OOPs;
class Car {
    private String brand;
    private String color;
    int speed;

    Car(String brand, String color, int speed){
        this.brand = brand;
        this.color = color;
        this.speed = speed;
    }

    Car(Car other){     // copy constructor
        this.brand = other.brand;
        this.color = other.color;
        this.speed = other.speed;
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

class Array{
    int [] arr;
    Array(int size){
        arr = new int[size];
    }
    Array(Array other){     // copy constructor
        this.arr = other.arr; // shallow copy

        // Deep copy
        this.arr = new int[other.arr.length];
        for(int i=0 ; i < other.arr.length ; i++){
            this.arr[i] = other.arr[i];
        }
    }
}

public class copy_constructor {
    public static void main(String[] args) {
        
        Array obj1 = new Array(10);
        Array obj2 = new Array(obj1);
        obj1.arr[2] = 10; // change obj1 arr
        System.out.println(obj2.arr[2]);


        Car car1 = new Car("Fortuner", "White", 120);
        Car car2 = new Car(car1);
    }
}
