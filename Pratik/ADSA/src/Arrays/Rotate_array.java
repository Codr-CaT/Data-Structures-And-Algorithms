package Arrays;
import java.util.*;

// approach - 1.array is provided
//2. no of elements to rotate are provided =d
//3. take upto d elements and put it in the end as it
//4.shift the remainging elements and keep the order intact
//code approach-1 First reverse from 0 to d-1
//2. then reverse from d to -1
class Rotate_array {
    public static void main(String[] args) {
        int arr[] = {45, 6, 7, 8907, 23, 56};
        int d = 2;
        int n = arr.length;
        d %= n;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    static void reverse(int arr[], int i, int j) {
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
