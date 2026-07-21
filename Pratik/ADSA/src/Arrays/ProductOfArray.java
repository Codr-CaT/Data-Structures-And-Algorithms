package Arrays;

public class ProductOfArray {
    public static void main(String[] args) {
        //product of array
        int [] arr = {3,7,6,8,9,6};
        int product = 1;
        for (int i =0;i< arr.length;i++){
            product= product* arr[i];
        }
        System.out.println(product);
    }
}
