import java.util.Arrays;
public class clg_java_arraay
{
//    public static void main(String[] args) {
                    // 1. the copy array
//        int [] nums ={1,2,3,4,5,6,7,8,8,0};
//        int [] arr = new int[nums.length];
//        for(int i=0;i<arr.length;i++){
//            arr[i]=nums[i];
//            System.out.println( "the copy array " + arr[i]);
//        }


                    //2. count frequency of elements
//    public static void countFreq(int arr[], int n)
//            {
//                boolean visited[] = new boolean[n];
//
//                Arrays.fill(visited, false);
//
//                // Traverse through array elements and
//                // count frequencies
//                for (int i = 0; i < n; i++) {
//
//                    // Skip this element if already processed
//                    if (visited[i] == true)
//                        continue;
//
//                    // Count frequency
//                    int count = 1;
//                    for (int j = i + 1; j < n; j++) {
//                        if (arr[i] == arr[j]) {
//                            visited[j] = true;
//                            count++;
//                        }
//                    }
//                    System.out.println(arr[i] + " " + count);
//                }
//            }
//
//            // Driver code
//            public static void main(String []args)
//            {
//                int arr[] = new int[]{ 10, 20, 20, 10, 10, 20, 5, 20 };
//                int n = arr.length;
//                countFreq(arr, n);
           // }

    //duplicate the array

    public static void main(String[] args) {
//        int [] nums={4,3,2,2};
//        int i=0;
//        int n= nums.length;
//      while(i<n){
//          int j=i+1;
//          while(j<n){
//              if(nums[i]==nums[j]){
//                  System.out.println(nums[i]);
//              }
//              j++;
//          }
//          i++;
//      }
      // largest element
        int largest=0;
        int []arr={3,4,2,33};
        int max =Integer.MIN_VALUE;
        for(int e :arr){
            if(e>max){
                 largest = e;
            }
        }
        System.out.println(largest);


    }


}




