import java.util.Arrays;

class RunningSum{
    public  static int[] runningSum(int[] arr) {
        for(int i = 1; i < arr.length ; i++){
             arr[i] = arr[i-1] + arr[i];  
        }
        return arr;
    }
     public static void main(String[]args){
        int []arr = {3,1,2,10,1};
        System.out.println(Arrays.toString(runningSum(arr)));
     }
}