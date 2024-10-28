public class bubble_sort {
    //time complexity 0(n^2)
    //bubble sort
    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {10, 9, 8, 7, 56, 7, 88, 33};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printarr(arr);

        //selection sort
//    public static void print(int array[]){
//        for(int i=0;i<array.length;i++){
//            System.out.print(array[i] +" ");
//        }
//        System.out.println();
//    }

        //  public static void main(String[] args){
//      int arr[] ={35,8,76,4,3,2,1};
//      for(int i=0;i<arr.length-1;i++){
//          int smallest =i;
//          for(int j=i+1;j<arr.length;j++){
//              if(arr[smallest]>arr[j]){
//                  smallest=j;
//              }
//          }
//          int temp=arr[smallest];
//          arr[smallest]=arr[i];
//          arr[i]=temp;
//      }
        // insert sort
//    public static void print(int arr[]) {
//       for(int i=0;i<arr.length-1;i++){
//     System.out.print(arr[i] +" ");
//        }
//        System.out.println();
//    }
//        public static void main (String[]args){
//            int arr[] = {8, 9, 6, 3};
//            for (int i = 1; i < arr.length; i++) {
//                int current = arr[i];
//                int j = i -1;
//                while (j >=0 && current < arr[j]) {
//                    arr[j + 1] = arr[j];
//                    j--;
//                }
//                arr[j + 1] = current;

//                print(arr);
//            }
//        }
    }
}
