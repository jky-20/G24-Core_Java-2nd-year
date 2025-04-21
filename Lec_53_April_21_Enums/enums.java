package Lec_53_April_21_Enums;

enum Day{
    Monday, Tuesday, Wednesday, Tursday, Friday, Saturday, Sunday;
}

enum STATUS{
    Success(200, "success"),
    NotFound(404, "Please hit a valid URL"),
    TimeOut(501, "Taking too long to respond, Try again later");

    private int code;
    private String msg;

    private STATUS(int code, String msg){
        this.code = code;
        this.msg = msg;
    }
    public int getStatusCode(){
        return this.code;
    }
    public String getStatusMsg(){
        return this.msg;
    }
}

enum Maths{
    Add{
        public int operation(int a, int b){
            return a + b;
        }
    },
    Multiply{
        public int operation(int a, int b){
            return a * b;
        }
    };
    public abstract int operation(int a, int b);
}

public class enums {
    public static void main(String[] args) {
        
        Day d = Day.Monday;

        switch (d) {
            case Monday:
                System.out.println("Here we go again!!");
                break;
            case Friday:
                System.out.println("Weekend starts !!");
                break;
            default:
                break;
        }

        STATUS urlResponse = STATUS.NotFound;
        System.out.println(urlResponse.getStatusCode() + " : " + urlResponse.getStatusMsg());

        for(STATUS s : STATUS.values()){
            System.out.println(s + " || " + s.getStatusCode() + " : " + s.getStatusMsg());
        }

        int sum = Maths.Add.operation(10, 20);
        // OR
        Maths m = Maths.Add;
        sum = m.operation(10, 20);
    }
}
