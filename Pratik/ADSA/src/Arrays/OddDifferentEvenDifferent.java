package Arrays;

public class OddDifferentEvenDifferent {
    public static void main(String[] args) {
        //Multiply Odd indexed Element by 2 and add 10 to even indexed elements
        int [] arr = {2,3,45,56,78,};
        for(int i =0;i<arr.length;i++){
            if(i%2==1){
                arr[i]*=2;
            }
            else{
                arr[i]+=10;
            }
        }
        for  (int i=0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
    }

}}
