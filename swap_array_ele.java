public class swap_array_ele {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};

        swap(arr);

        for(int i : arr){
            System.out.println(i);
        }
    }
    static void swap(int[] arr){
        int t = arr[0];
        arr[0] = arr[1];
        arr[1] = t;
    }
    static void swap(int a,int b){
        int t = a;
        a = b;
        b = t;
    }
}
