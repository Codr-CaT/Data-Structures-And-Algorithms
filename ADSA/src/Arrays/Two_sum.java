package Arrays;

public class Two_sum {
    public static void rmmain(String[] args) {
        int [] arr ={45,67,8,9,45};
        int target =78;
        int first=0;
        int second=0;
        boolean flag =false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]+ arr[j]==target){
                    flag = true;
                     first =arr[i];
                     second = arr[j];
                }
            }
        }
        if(!flag) System.out.println("item couldnt be calculated");
        else System.out.println(first + second);

    }
}
