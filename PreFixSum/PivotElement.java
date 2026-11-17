class PivotElement{
     public  static int pivotIndex(int[] arr) {
        int total  = 0;
        for(int a:arr){
            total += a;
        }
        int lSum = 0;
        for(int i = 0; i < arr.length;i++){
            if(lSum == total - lSum - arr[i]){
                return i;
            }
            lSum +=arr[i];
        }

        return -1;
    }
    public static void main(String[]args){
        int[]arr = {1,2,3};
        System.out.println(pivotIndex(arr));
    }
}