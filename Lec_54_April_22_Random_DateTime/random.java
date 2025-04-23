package Lec_54_April_22_Random_DateTime;

import java.util.Random;

public class random {
    public static void main(String[] args) {
        
        Random random = new Random();

        int num = random.nextInt();

        // in range [0,99]
        num = random.nextInt(100);

        // generate 10 random numbers in range [0,100]
        for(int i=0 ; i<10 ; i++){
            System.out.println(random.nextInt(101));
        }

        // Generate random number in range [50,100]
        num = random.nextInt(50,101);   // in Java 17 and above
        num = random.nextInt(51) + 50;  // in Java <17

        // Generate 20 random numbers in range [-100,100]
        for(int i=0 ; i<20 ; i++){
            System.out.println(random.nextInt(-100, 101));  // Java >=17
            System.out.println((random.nextInt(201) - 100));    // java <17
        }

        // Generate a 6 digit OTP
        int OTP = random.nextInt(100000, 1000000);

        // Generate a 6 digit OTP without 0
        OTP = 0;
        for(int i=0 ; i<6 ; i++){
            OTP = OTP * 10;
            OTP = OTP + random.nextInt(9) + 1;
        }
        System.out.println(OTP);
    }
}
