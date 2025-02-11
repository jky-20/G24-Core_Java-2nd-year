package Lec_29_Feb_10_OOPs;

abstract class MotorVehicle{
    String name;
    abstract void start();
    // abstract private void abstract_method();    // abstract method can't be private
    // abstract static void static_method();    // abstract method can't be static
    // abstract final void final_method();    // abstract method can't be final
    void print(){
        System.out.println("I'm Abstract Class");
    }
    // other functionality can be same
    static void static_non_abstract_method(){

    }
    MotorVehicle(){
        System.out.println("Motor Vehicle");
        this.name = "Abc";
    }
}

abstract class Car extends MotorVehicle{
    // class must be abstract because 
    // it is not implementing abstract methods in parent class
}

class Bike extends MotorVehicle{
    void start(){
        System.out.println("Starts from Kick");
    }
}

public class abstraction {
    public static void main(String[] args) {
        
        // cannot make objects of abtract class
        // MotorVehicle mv = new MotorVehicle();
    }
}
