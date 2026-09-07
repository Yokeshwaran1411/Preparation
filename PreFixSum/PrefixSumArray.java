import java.util.Arrays;

//worst case
class Solution{
    public static int returnTotal(int arr[],int i){
        int total = 0;
        for(int j = 0; j <= i; j++){
            total += arr[j];
        }
        return total;
    }
    public static int[] PreFixSum(int arr[]){
        Solution sol = new Solution();
        
        int[]res = new int[arr.length];
        for(int i = 0; i < arr.length;i++){
            res[i] = sol.returnTotal(arr,i);
        }

        return res;
    }
}


//best case
class Solution2{
    public static int[] PreFixSum(int arr[]){
        int[]res = new int[arr.length];
        res[0] = arr[0];
        for(int i = 1; i < arr.length;i++){
            res[i] = res[i-1]+arr[i];
        }
        return res;
    }
}

class PreFixSum {
    public static void main(String[] args) {
        int[]arr = {30, 10, 10, 5, 50};
        Solution2 sol = new Solution2();
        System.out.println(Arrays.toString(sol.PreFixSum(arr)));
    }
}