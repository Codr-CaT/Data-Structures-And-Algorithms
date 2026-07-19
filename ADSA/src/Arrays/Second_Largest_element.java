package Arrays;

public class Second_Largest_element {
    public static void main(String[] args) {
        //loigic-1 find the largest element
        //2 find the largest except max
        int [] sol =new int[1];
        int arr[] ={3,4,5,6,7,8,9};
        int max =Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]> max){
                max = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=max && smax<arr[i]) smax =arr[i];

        }
        System.out.println(smax);

    }
}
