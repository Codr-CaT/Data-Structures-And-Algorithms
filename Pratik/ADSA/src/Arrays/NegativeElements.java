package Arrays;

import java.util.Scanner;

public class NegativeElements {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array");
            int n = sc.nextInt();
            int [] arr = new int[n];
            for (int i=0;i<n;i++){
                System.out.print("enter the element of array");
                arr[i]=sc.nextInt();
            }
            //Given an array printing negative elements only
            for(int i=0;i<n;i++){
                if(arr[i]<0){
                    System.out.println(arr[i]);
                }
            }
                    ;

    }
}
