package Lec_36_Feb_20_OOPs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Group_24{
    String name;
    int marks;
    Group_24(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
}

class SortByMarks implements Comparator<Group_24>{
    @Override
    public int compare(Group_24 obj1, Group_24 obj2){
        return Integer.compare(obj1.marks, obj2.marks);
    }
}

class SortByName implements Comparator<Group_24>{
    @Override
    public int compare(Group_24 obj1, Group_24 obj2){
        return obj1.name.compareTo(obj2.name);
    }
}

public class comparator {
    public static void main(String[] args) {
        
        ArrayList<Group_24> arr = new ArrayList<>();
        arr.add(new Group_24("Jai",62));
        arr.add(new Group_24("Satyam",72));

        Collections.sort(arr, new SortByMarks());
    }
}
