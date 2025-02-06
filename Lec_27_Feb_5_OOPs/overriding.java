package Lec_27_Feb_5_OOPs;

class motor_vehicle{
    motor_vehicle(){
        System.out.println("Motor Vehicle");
    }
    void start(){
        System.out.println("switch on motor engine");
    }
    motor_vehicle get_Vehicle(){
        return new motor_vehicle();
    }

    static void print(){
        System.out.println("static method in parent class");
    }
    final void final_func(){
        System.out.println("Final function");
    }

    private void func(){
        System.out.println("private function");
    }

    protected void protected_func(){
        System.out.println("protected function");
    }
}

class car extends motor_vehicle{

    // motor_vehicle(){        // constructors can't be override
    //     System.out.println("Car Vehicle");
    // }
    
    void func(){   // not a overridden method
        System.out.println("function");
    }
    void start(){
        System.out.println("Starts by key");
    }
    
    // @Override    // specifies function must override method
    // void strt(){

    // }
    car get_Vehicle(){
        return new car();
    }

    // void print(){   // can't be overridden
    //     System.out.println("static method in parent class");
    // }

    static void print(){    // method hiding
        System.out.println("Not a overridden function");
    }

    // void final_func(){   // can't be overridden
    //     System.out.println("Final function");
    // }
}

class bike extends motor_vehicle{

    void start(){
        System.out.println("Starts by kick");
    }

    // scope of methods while overriding 
    public void protected_func(){    // must have same or larger scope
        System.out.println("protected function");
    }
}

public class overriding {
    public static void main(String[] args) {
        
        car c1 = new car();
        c1.start();     // calls overridden method
    }
}
