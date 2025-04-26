package Lec_56_April_24_FileHandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandling {
    public static void main(String[] args) {
        
        try {
            File file = new File("example.txt");

            // creating a new file
            if(file.createNewFile()){
                System.out.println("File Created !!");
            }
            else{
                System.out.println("File already exists !!");
            }

            // writing in a file
            FileWriter writer = new FileWriter(file, true);
            writer.write("/nEe saala cup namde!");
            writer.close();

            // reading a file
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String str = reader.nextLine();
                System.out.println(str);
            }
            reader.close();
            
            // delete a file
            if(file.delete()){
                System.out.println("File Deleted !!");
            }
            else{
                System.out.println("File can't be deleted !!");
            }
        } 
        catch (IOException e) {
            System.out.println("File error");
            e.printStackTrace();
        }
    }
}
