public class check_sortedarray {
//    public static boolean checksorted(int []arr , int ind){
//        if(ind == arr.length-1){
//            return true;
//        }
//        if(arr[ind] < arr[ind+1]){
//          return checksorted(arr,ind+1);
//        }else {
//            return false;
//        }
//    }
    public static void movex(String s, String str , String newstr,int i ){
if(i >=s.length()){
    System.out.println(newstr+str);
    return;
}
if(s.charAt(i) == 'x'){
    str +=s.charAt(i);
}else{
    newstr += s.charAt(i);
}
movex(s,str,newstr,i+1);
    }
    public static void main(String[] args) {
//        int []arr ={1,3,8};
//        int ind=0;
//        System.out.println(checksorted(arr,ind));

        String s ="axbcxxd";
       movex(s,"","",0);

    }
}
