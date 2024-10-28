import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class array {
    public static void main(String[] args) {
//        float arr[] = {4f,5f,7f,67f,4f};
//        float sum =0;
//        for(float element:arr){
//            sum = sum+element;
//            System.out.println(sum);
//        }


//        int avg=0;
//        int marks[] ={56,74,75,44,66,78,54};
//        for(int element:marks){
//             avg= avg+element;
//
//        }
//        System.out.println(avg/7);


        /*
        int m1[][] ={{2,4,5},
                  {4,5,1}};
        int m2[][] ={{2,4,1},{0,1,2}};
        int sum[][] ={{0,0,0},{0,0,0}};
       for(int i=0;i<m1.length;i++){
           for(int j=0;j<m1[i].length;j++){
               System.out.format("i=%d j=%d\n",i , j);
               sum[i][j]=m1[i][j]+m2[i][j];
               System.out.println(sum[i][j]);
           }
           System.out.println();
       }

         */
        /*
        int arr[] ={1,2,3,4,5,6,7,8,9,10};
        for(int i =arr.length;i>0;i--){
            System.out.println(i);
        } */
        /*
        int max =0;
        int arr[] = {7,88,9,6,0,56};
        for(int e:arr){
if(max<e) {
    max=e;

}
        }
        System.out.println(max);

         */
        /*
        int mini = Integer.MAX_VALUE;
        int arr[] ={3,-45,0,4,2,4};
        for(int e:arr){
            if(mini>e){
                mini =e;
            }
        }
        System.out.println(mini);

         */
//        int arr[] = {34,5,33,5,7};
//        boolean isorted =true;
//        for(int i =0;i<arr.length-1;i++){
//                if(arr[i]>arr[i+1]){
//                    isorted = false;
//                    break;
//                }
//
//            }
        //find the index of array element
//Scanner s = new Scanner(System.in);
//        System.out.println("enter any number");
//int input = s.nextInt();
//int arr[] ={1,5,7,3,6,8};
//if(arr.length==0){
//    System.out.println("-1");
//}
//for(int i=0;i<=arr.length;i++){
//    if(arr[i]==input){
//        System.out.println("index of position "+ i);
//    }
//}
        //find a specific value is present in array
//        Scanner s= new Scanner(System.in);
//        System.out.println("enter a specific number");
//        int special = s.nextInt();
//        int arr[] ={2001,2002,2003,2004,2005};
//        int i=0;
//                while(i<=arr.length){
//            if (arr[i] == special) {
//                System.out.println(special);
//            }
//            i++;
//        }
        //remove spcial element on array
/*
        int special = 34;
        int n[]={34,2,45,55,98};
        int arr[] = new int[5];
        System.out.println(n);
        for(int i=0;i<n.length;i++){
          arr[i]=n[i+1];
            System.out.println(arr[i]);
        }
        */
        //copy the array
        /*
        int arr[]={1,24,56,88,99};
        int newarr[] =new int[5];
        for(int i=0;i<arr.length;i++) {
            newarr[i]=arr[i];
            System.out.println(newarr[i]);
        }
       */ //mini and maxi value in array
        /*
        int arr[] = {1, 23, 4, 67, 5};
        int max = Integer.MIN_VALUE;
        int min =Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
if(arr[i]>max){
    max=arr[i];
}}
        System.out.println("maximum value is:" +max);
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("minimum value is:" +min);
           */
//        int arr[] = {1, 3, 2, 9,3};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]&&i!=j) {
//                    System.out.println("duplicate value is present " +arr[j]);
//                }
//
//                }
//
//            }
//        System.out.println("not");
        //array of string find duplicate
//        String s[]={"sa","ks","hi","sa"};
//        for(int i=0;i<s.length;i++){
//            for(int j=i+1;j<s.length;j++){
//                if(s[i]==s[j]&&i!=j){
//                    System.out.println("duplicate string "  +s[j]);
//                }
//            }
//        }

        //common element
//        String s1[]={"i","love","u"};
//        String s2[]={"u","are","mine"};
//        for(int i=0;i<s1.length;i++){
//            for(int j=0;j<s2.length;j++){
//                if(s1[i]==s2[j]){
//                    System.out.println("common element " +s2[j]);
//                }
//            }
//        }
        //remove a element in array
//        int a[] = {4, 23, 7, 8, 70};
//        int remo = 8;
//        for (int i=0;i<a.length; i++) {
//            if (remo == a[i]) {
//                for (int j=i;j<a.length-1;j++) {
//                    a[j] = a[j+1];}
//                break;}}
//        for (int i = 0; i < a.length-1; i++) {
//            System.out.println(a[i]);
//        }
        //insert element
//        int a[] = {10,20,30,50,60};
//        int insert =40;
//        int pos=4;
//        for(int i=a.length-1;i>=pos-1;i--){
//            a[i]=a[i-1];
//        }
//        a[pos-1]=insert;
//        for(int i=0;i<a.length;i++){
//            System.out.println(a[i]);
//        }remove duplicate element in array
        //sort array remove duplicate element
//        int a[] ={0,1,1,2,2,3,4};
//        int j=0;
//        int temp[] =new int[a.length];
//            for(int i=0;i<a.length-1;i++){
//                if(a[i]!=a[i+1]){
//                    temp[j]=a[i];
//                    j++;
//                }
//            }
//            temp[j]=a[a.length-1];
//        for(int i=0;i<temp.length-1;i++){
//            System.out.println(temp[i]);
//        }
        //unsort remove duplicate element
//        int j=0;
//        int a[]={1,2,6,1,5};
//        for(int i=0;i<a.length-1;i++){
//            System.out.print(a[i]);
//            if(a[i]!=a[i+1]){
//                a[i]=a[j];
//                j++;
//            }
//        }
//        a[j]=a[a.length-1];
//        for(int i=0;i<a.length-1;i++){
//            System.out.println(a[i]);
//        }
        //2 largest element
//        int a[]={3,4,25,5,6,77,};
//        Arrays.sort(a);
//        for(int i=a.length-1;i>0;i--) {
//            System.out.println(a[4]);
//        }
        //2 smallest number
//        int a[]={1,24,5,6,0,4,5};
//        Arrays.sort(a);
//        int i=0;
//        while(i<a.length-1){
//            System.out.println(a[1]);
//            i++;
//        }
        //add 2 matrix of same size
//        int a[][] = {{1,2,1},{
//            1,2,0},{5,0,1}};
//        int b[][] = {{2,3,1},{0,2,9},{1,2,3}};
//        int sum[][] = new int[3][3];
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                sum[i][j] = a[i][j] + b[i][j];
//                System.out.print(sum[i] [j]);
//            }
//            System.out.println();
//        }
        //convert array into arraylist
//        String s[]={"sa","op","lpa","ako"};
//        ArrayList list =new ArrayList<>(Arrays.asList(s));
//        System.out.println(list);

        int [] nums ={2,5,7};
        int target =9;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                sum=nums[i]+nums[j];
                if(sum==target){
                    System.out.println(i);
                    System.out.println(j);
                }
            }
        }
    }
}



