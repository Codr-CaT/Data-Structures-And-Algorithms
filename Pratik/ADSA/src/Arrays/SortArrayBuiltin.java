package Arrays;
import java.util.*;

public class SortArrayBuiltin {
    public static void main(String[] args) {
          int [] arr ={2,3,4,5,6,7};
          print(arr);
          Arrays.sort(arr);
          print(arr);
    }

    public static void print(int [] arr) {
         for (int i=0;i<arr.length;i++){
             System.out.println(arr[i]);
         }
    }
}
