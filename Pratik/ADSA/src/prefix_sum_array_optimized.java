import java.util.*;
public class prefix_sum_array_optimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int L = sc.nextInt();
        int R = sc.nextInt();
        int [] prefix = buildPrefix(arr);
        System.out.println(rangeSum(prefix,L,R));
    }
    public static int[] buildPrefix(int[] arr){
        int n = arr.length;
        int[] prefix = new int[n];

        prefix [0] =arr[0];
        for (int i =1;i<n;i++){
            prefix [i] =prefix[i-1] + arr[1];
        }
        return prefix;
    }
    public static int rangeSum(int [] prefix,int L , int R){
        return (L==0)? prefix[R] : prefix[R]-
        prefix[L-1];


    }
    }


