package Lec_24_Jan_30_OOPs;

class employe{
    int salary;
    String name;
    employe(int salary, String name){
        this.name = name;
        this.salary = salary;
    }
    void print(){
        System.out.println("Parent class");
    }
}
class engineer extends employe{
    int bonus;
    engineer(int bonus){
        // System.out.println(this.salary);    // salary is not initialized 
        super(1000, "Jai");
        this.bonus = bonus;
    }
    void print(){
        super.print();  // access hidden methods in parent class
        System.out.println("Child class");
    }
}

public class inheritance {
    public static void main(String[] args) {
        
        engineer e1 = new engineer(1000);
        e1.print();
    }
}
