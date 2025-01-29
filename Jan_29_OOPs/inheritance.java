package Jan_29_OOPs;

class employe{
    int salary;
    String name;
    employe(){
        System.out.println("Employee");
    }
}

class engineer extends employe{     // single level inheritance
    int bonus;
    engineer(){
        System.out.println("Engineer");
    }
}

public class inheritance {
    public static void main(String[] args) {
        
        engineer e1 = new engineer();
        e1.name = "Jai";

        employe emp1 = new employe();

        System.out.println(e1 instanceof engineer);     // e1 belongs to engineer
        System.out.println(e1 instanceof employe);      // e1 belongs to employee
        System.out.println(emp1 instanceof engineer);   // emp1 does not belongs to engineer


        employe emp2 = new engineer();      // valid syntax
        // engineer emp = new employe();    // invalid syntax
    }
}
