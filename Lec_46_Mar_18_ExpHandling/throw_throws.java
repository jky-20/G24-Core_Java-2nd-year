package Lec_46_Mar_18_ExpHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class throw_throws {
    static void function() throws FileNotFoundException{
        FileReader file = new FileReader("Test.txt");

        try{
            int[] arr = new int[3];
            System.out.println(arr[4]);
        }
        catch(ArrayIndexOutOfBoundsException ex){
            // throw ex;
            throw new ArrayIndexOutOfBoundsException("Invalid index");
        }
    }
    public static void main(String[] args) {
        try{
            function();
        }
        catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
    }
}
