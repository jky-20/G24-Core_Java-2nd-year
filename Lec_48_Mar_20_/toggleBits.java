package Lec_48_Mar_20_;

public class toggleBits {
    public static void main(String[] args) {
        

        int mask = 0;
        for(int i=11 ; i>0 ; i--){
            if(i==11 || i==8 || i==5 || i==4 || i==2){
                mask = mask | 1;
            }
            mask = mask << 1;
        }
    }
}
