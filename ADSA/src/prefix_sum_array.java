import java.sql.SQLOutput;
import java.util.*;

public class prefix_sum_array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter how many arrays");
        int t = sc.nextInt(); // number of test cases
        while(t-- > 0) {
            System.out.println("Enter the size of array");
            int n = sc.nextInt();
            int[] arr = new int[n];

            for(int i = 0; i < n; i++) {
                System.out.println("enter the next element");
                arr[i] = sc.nextInt();
            }
            System.out.println("enter the left index");
            int L = sc.nextInt();
            System.out.println("enter the right index");
            int R = sc.nextInt();

            System.out.println(rangeSumBrute(arr, L, R));
        }
    }

    public static int rangeSumBrute(int[] arr, int L, int R) {
        int sum = 0;
        for(int i = L; i <= R; i++) {
            sum += arr[i];
        }
        return sum;
    }
}