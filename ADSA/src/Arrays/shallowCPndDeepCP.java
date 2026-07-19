package Arrays;
import java.util.*;
public class shallowCPndDeepCP {
    public static void main(String[] args) {
        int []  arr ={01,20,30,40};
//        int []x =arr;// x is shallow copy of arr, both x and arr are pointing to the same array and hence changes applied through any pointer are reflects int the orginal array
//        x [0]=100;
//        System.out.println(arr[0]);
        int [] deep= Arrays.copyOf(arr,arr.length);
        // deep copy i,e which array to make replica and upto which lenght changes in deep copy makes an individual array and it doesnt affect the orginal
        deep [0]= 100;
        System.out.println(arr[0]);
        System.out.println(deep[0]);

    }
}
