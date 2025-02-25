package Lec_37_Feb_25_OOPs;

interface generic_interface<T>{
    T getKey();
    void setKey(T key);
}
class example<T> implements generic_interface<T>{
    private T key;
    public T getKey(){
        return this.key;
    }
    public void setKey(T key){
        this.key = key;
    }
}

class key_val<K,V>{
    K key;
    V val;
    key_val(K key, V val){
        this.key = key;
        this.val = val;
    }
    K getKey(){
        return this.key;
    }
}

class normalClass{
    static <T> void print(T obj){
        System.out.println(obj);
    }
}

public class generics {
    public static void main(String[] args) {
        
        key_val<String, Integer> obj1 = new key_val("Jai", 1);
        
        normalClass.print("Jai");
        normalClass.print(3);
    }
}
