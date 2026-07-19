package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int [] arr ={23,9,45,67,89,9};
        int target =9;                  //if we want to stop searh on the first existance of element we will use flag
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                flag = true;
                break;
            }

        }
         if(flag) System.out.println("Item  Found");
         else  System.out.println("item not found");

    }
}
