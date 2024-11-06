public class tower_of_hanio {
//    public static void tower(int n , String srs, String helper , String des){
//        if(n == 1){
//            System.out.println("the disk " + n +  " transfer " + srs + " to " + des);
//            return;
//        }
//        tower(n-1,srs,des,helper);
//        System.out.println("the disk " + n + " transfer " + srs + " to " + des);
//        tower(n-1,helper,srs,des);
//}
    //sum odd numbers in array
    public static void sumodd( int []arr ,int i,int sum){
if(i > arr.length-1){
    System.out.println("the sum all odd numbers in array is:" +sum);
    return;
}
        if(arr[i] % 2 != 0){
            sum+=arr[i];
        }
        sumodd(arr,i+1,sum);

    }

    public static void main(String[] args) {
//int n=2;
//        tower(n,"Source","Helper","Destination");
//    }

        int [] arr ={1,3,9,3,5};
        int i=0;
        int sum=0;
        sumodd(arr,i,sum);
    }

}
