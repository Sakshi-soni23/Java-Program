import java.util.Scanner;

public class ch_6_array {
  public static void main(String[] args) {
//        System.out.println("enter any number");
//        Scanner sc = new Scanner(System.in);

/*
        Float [] arr = {2.3f,3.4f,3.6f,4.5f,3.3f};
        float sum =0;
        for(float element:arr){
            sum = sum+element;
        }
        System.out.println(sum);
    }

 */
        //question 2 check integer is present in array or not
//        int [] arr =  {3,35,6,7,3,6};
//        int target = sc.nextInt();
//           if(arr.length==target){
//               System.out.println("your element is present in array");
//           }
//           else{
//               System.out.println("not present");
//           }
//q3 average marks
        /*
        int[] marks = {34, 56, 77, 44, 77, 34, 56};
        int sum = 0;
        for (int element : marks) {
            sum = sum + element;
        }
        System.out.println(sum/7);

         */
        //problem4
        /*
        int [][] result = {{0,0,0},
                {0,0,0}};
        int [][] m1 = {{2,1,3},
                {4,5,6}};
        int [][] m2= {{32,21,6},
                {6,7,8}};
        for(int i=0;i<m1.length;i++){
            for(int j=0;j<m1[i].length;j++){
                System.out.format("i=%d j=%d\n",i , j);
                result[i][j] = m1[i][j]+m2[i][j];
            }
        }
        int [][] mat1 = {{2,1,3},
                      {4,5,6}};
        int [][] mat2 = {{1,9,6},
                {6,7,8}};
        int [][] sum2 = {{0,0,0},
                {0,0,0}};
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                sum2[i][j] = mat1[i][j] + mat2[i][j];
                System.out.print(sum2[i][j] +" ");
            }
            System.out.println(" ");
        }

         */
        //problem 5 reverse the array
        /*
        int [] arr ={1,2,3,4,5,6,7,8,9};

       for(int i=arr.length;i!=0;i--){
            System.out.println(i);

        }
         */ //mini and maxi e in the array
        /*
        int [] a={14,2,4,90,6,444};
        int mini= Integer.MAX_VALUE;
        for(int e:a){
            if(e<mini){
                mini=e;
            }
        }
        System.out.println("the minimum value in this array is:"+ mini);

         */
        /*
        int []arr;
        for(int i=0;i<=5;i++){
            for(int j=0;j<=5;j++){
                System.out.print(" - ");
            }
            System.out.println(" ");
        }
          */
        //to find the average of the given array
        /*
        float [] a = {2.0f,5f,6f,4f,1f};
        float sum =0;
        for(float element:a){
            sum = sum+element;
        }
        System.out.println(sum/a.length);
         */
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a value for a");
        int a = sc.nextInt();
        System.out.println("enter a value for b");
        int b = sc.nextInt();
        int res = a+b;
        int pro =  a*b;
        int sub = a-b;
        int div = a/b;
        int rem = a%b;
        System.out.println(res);
        System.out.println(pro);
        System.out.println(sub);
        System.out.println(div);
        System.out.println(rem);

         */
        /*
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 3, 4, 5, 6, 7};
        int target = sc.nextInt();
        for(int i=0;i<arr.length;i++) {
            if (arr[i] == target) {
                System.out.println(i);
            }
        else{
                i = i + 1;
            }
        }

         */
        /*
        float pie = 3.14f;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of radius");
        int r = sc.nextInt();
        float area = pie*r*r;
        float perimeter = 2f*pie*r;
        System.out.println(area);
        System.out.println(perimeter);

         */
        /*
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                System.out.print( " * ");
            }
          System.out.println(" =====================");
        }
        for (int i = 5; i <= 8; i++) {
            for (int j = 5; j <= 7; j++) {
                System.out.print("=============");
            }
            System.out.println("  ");
        }

         */
        /*
       int [] arr={3,3,5,4,5,5,5};
       for(int i=0;i<arr.length-1;i++){
           for(int j=i+1;j<arr.length;j++){
               if((arr[i]==arr[j])&&(i!=j)){
                   System.out.println("duplicate element :"+ arr[j]);
               }
           }
       }

         */
        //table
/*
        int n =2;
        for(int i =1;i<=10;i++){
            System.out.format(" %d X %d = %d\n", i,n,n*i);
        }*/
    /*
        static int sum(int n) {
            if (n == 1) {
                return 1;
            }
            return n + sum(n - 1);
        }

    public static void main(String[] args) {
       int c = sum(5);
        System.out.println(c);

     */ //fibonacci series
   for(int i=1;i<3;i++){
       for(int j=1;j<3;j++){
           int sum = i+j;
           int fibo= j+sum;
           System.out.println(fibo);
       }
   }
  }
    }


