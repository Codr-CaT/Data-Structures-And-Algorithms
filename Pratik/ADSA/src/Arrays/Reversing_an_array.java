package Arrays;

public class Reversing_an_array {
    public static void main(String[] args) {
        int [] arr={3,4,19,45,6,7,89,48};
        int n= arr.length;
        int i =0;
        int j=n-1;
        while(i<j){
            int temp =arr[i];
            arr[i] =arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int ele: arr) System.out.print(ele+" ");
    }
}
