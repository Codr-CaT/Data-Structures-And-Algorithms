package Arrays;

import java.util.Scanner;

public class Input_and_output_of_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //output
        int[] arr ={5,6,7,8,9,34,56,78,};
        int n =arr.length;
        for  (int i=0;i<n;i++){
            System.out.println(arr[i]);}
        //output with default value
            int [] pratik =new int[8];
            int m= pratik.length;
            for(int i=0;i<m;i++){
                System.out.println(pratik[i]);
            }
            //taking  user input through loops in array
            for(int i=0;i<8;i++){
                System.out.print("enter another number :");
                pratik[i] =sc.nextInt();
            }
            //printing the input
            for(int i=0;i<m;i++){
                System.out.println(pratik[i]);
            }
            //printing the double output of input
        for(int i=0;i<m;i++){
            System.out.println(pratik[i]*2);
        }

        }
    }
