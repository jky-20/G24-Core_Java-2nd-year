package Lec_59_April_29_Serializations_Deserialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Example implements Serializable{
    private static final long serialVersionUID = 3L;    // for best practise
    String name;
    transient int roll;

    public Example(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
}

public class serialization_deserialization {
    public static void main(String[] args) {
        
        Example student = new Example("Jai", 123456);
        try{
            // Serializing Objects
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Lec_59_April_29_Serializations_Deserialization\\example.ser"));
            oos.writeObject(student);

            // Desrializing Objects
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Lec_59_April_29_Serializations_Deserialization\\example.ser"));
            Example obj = (Example)ois.readObject();

            System.out.println(obj.name);
            System.out.println(obj.roll);
        }
        catch(Exception e){

        }
    }
}
