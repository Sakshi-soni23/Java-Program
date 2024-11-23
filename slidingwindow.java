public class slidingwindow {
    public static void main(String[] args) {
        int [] arr ={1,2,4,6,7,8};
        int window = 3;
        int n=arr.length;
        int current =0;
        for(int i=0; i<window ; i++){
            current+=arr[i];
        }
        int max= current;
        for(int i=1; i<=n-window; i++){
            current = current-arr[i-1]+arr[i+window-1];
            if(current>max){
                max =current;
            }
        }
        System.out.println("the maximum sum of subarrayis:" + max);
    }
}
