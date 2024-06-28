public class Apractice {
    public static void main(String[] args) {

        //float[] marks = {4.5f,7.7f,8.9f,9.7f,6.5f};
        //float sum=0;
        //for(float element:marks){
        //  sum = sum +element;
        //}
        //System.out.print(sum);


//p2
        /*
        float[] marks = {4.5f,7.7f,8.9f,9.7f,6.5f};
        float num = 8f;
        for(float element:marks) {
            if (num == element) {
                System.out.println("this element is present in array");
            }
            else {
                System.out.println("this element is not present in array");

            }
        }
        System.out.println(num);
    }

         */
        //p3
        /*
        int [] marks = {78,87,66,89,44,56,77};
        int sum=0;
      //  int avg=0;
        System.out.println("the average marks of physic of all the student");
        for(int element:marks){
            sum = sum+element;
           // avg = sum/7;

        }
        System.out.println(sum/marks.length);

    }

         */
        /*
        //p4 to add two matrix of size 2x3
        int [][] mat1 = {{2, 3, 4},
                {5, 6, 7}};
        int [][] mat2 = {{8, 9, 3},
                          {6, 7, 5}};
        int [][] result= {{0,0,0},
                {0,0,0}};
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j <mat1[i].length; j++) {
                System.out.format(" setting the value for i=%d and j=%d\n", i, j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j<mat1[i].length; j++) {
                System.out.print(result[i][j] + "  ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println(" ");
        }

         */

        //problem of swapping the number
  /*
        int[]a = {10,20,30,40,50,60,70,80,90,100};
        int temp;
        int l = a.length;
        int n = Math.floorDiv(a .length,2);
        for(int i =0;i<n;i++){
           temp = a[i];
           a[i] = a[l-i-1];
           a[l-i-1] = temp;


        }
        for(int element:a){
            System.out.println(element);
        }

   */
        // second q of swapping
        /*
        int [] num = {10,20};
        //num = new int[2];
        int temp;
        int n = Math.floorDiv(num.length,2);
        int l=num.length;
       int x;
       int y;
        for(int i=0;i<n;i++) {
            temp = num[i];
            num[i] = num[l-i-1];
            num[l-i-1]= temp;
        }

        for(int element:num){
            System.out.println(element);
        }

         */
        /*
        int x=89;
        int y=90;
        System.out.println("before swapping");
        System.out.println(x +" ");
        System.out.println(y +" ");
        int temp =x;
        x = y;
        y=temp;
        System.out.println("after swapping");
        System.out.println(x +" ");
        System.out.println(y +" ");




         */
        /* //problem to arrange number in reverse form
        int [] num ={1,2,3,4,5,6,7,8,9,0};
        num = new int[10];
        for(int i=10; i>=1;i--){
            System.out.println(i);
        }

         */
        //problem to find the maximum no.
        /*
        int[] a = {4, 56, 3, 66, 78, 98, 33, 22};
        int max = 0;
        for (int e : a) {
            if (e > max) {
                max = e;
                //.out.println("maximum number");
            }
        }
            System.out.println("the maximum value of element is:" );
        System.out.println(max);



         */
        //minimum problem
        int [] arr ={5,67,8,733,6,77,6};
        int mini = Integer.MAX_VALUE;
        for(int e:arr){
            if (e<mini){
                mini=e;
            }
        }
        System.out.println("it is the value of minimum number in this all the array");
        System.out.println(mini);
    }
}
