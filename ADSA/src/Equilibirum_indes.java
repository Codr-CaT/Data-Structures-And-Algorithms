import java.util.*;

public class Equilibirum_indes{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(equilibriumIndex(arr));
    }

    public static int equilibriumIndex(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            int leftSum = 0, rightSum = 0;

            for(int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            for(int j = i + 1; j < n; j++) {
                rightSum += arr[j];
            }

            if(leftSum == rightSum) return i;
        }

        return -1;
    }
}