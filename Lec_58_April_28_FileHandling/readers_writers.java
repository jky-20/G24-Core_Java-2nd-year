package Lec_58_April_28_FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class readers_writers {
    public static void main(String[] args) {
        
        File file = new File("Lec_58_April_28_FileHandling\\example.txt");
        
        try {
            file.createNewFile();

            FileWriter fw = new FileWriter(file);   // writes char by char
            FileReader fr = new FileReader(file);   // reads char by char

            // reading and writing in Buffer
            BufferedReader bfr = new BufferedReader(fr);
            BufferedWriter bfw = new BufferedWriter(fw);
            Scanner sc = new Scanner(file);
        } catch (Exception e) {
        }
    }
}
