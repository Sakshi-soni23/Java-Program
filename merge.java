import java.util.*;

public class merge {
    /*
    public static void conquer(int arr[] , int mid,int s,int e){
int merge[] = new int[e-s+1];
int inde1 = s;
int inde2 = mid+1;
int m= 0;
while(arr[inde1]<=mid&&arr[inde2]<=e){
    if(arr[inde1]<=arr[inde2]){
        merge[m++]=arr[inde1++];
    }else {
        merge[m++]=arr[inde2++];
    }
while(inde1<=mid){
    merge[m++]=arr[inde1++];
}
while (inde2<=mid){
    merge[m++]=arr[inde2++];
}
}
for(int i=0,j=s;i<= arr.length;i++,j++){
    merge[j]=merge[1];
}
    }
    public static void divide(int arr[] , int s,int e){
        int mid = s+(e-s)/2;
        if(s>=mid){
            return;
        }
        divide( arr , s, mid);
        divide(arr , mid+1, e);
      conquer(arr,mid,e,s);
    }

    public static void main(String[] args) {
        int arr[] ={1,4,5,7,6,8,0};
        int n =arr.length;
        divide(arr,0,n-1);
        for(int i=0;i<=arr.length;i++){
            System.out.println(" "+arr[i]);
        }
        System.out.println();
    }

     */
    public static void main(String[] args) {


        int arr[] = {6,4,2,1};
        Arrays.sort(arr);
//        System.out.println("this is sorted array"+ arr);
        int sum=0;
        for(int i=0;i<arr.length-1;i+=2){
           if(arr[i]<arr[i+1]) {
               sum += arr[i];
           }
           else {
               sum +=arr[i+1];
           }}
            System.out.println(sum);


    }
}
