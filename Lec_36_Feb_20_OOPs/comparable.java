package Lec_36_Feb_20_OOPs;

import java.util.ArrayList;
import java.util.Collections;

class G_24 implements Comparable<G_24>{
    String name;
    int marks;
    G_24(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(G_24 obj2){
        return Integer.compare(this.marks, obj2.marks);
    }
}

public class comparable {
    public static void main(String[] args) {
        
        ArrayList<G_24> arr = new ArrayList<>();
        arr.add(new G_24("Jai",62));
        arr.add(new G_24("Satyam",72));

        Collections.sort(arr);
    }
}
