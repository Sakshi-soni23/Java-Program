import java.util.Arrays;

public class leetcode_qu {
//    public  static boolean  isallupercase(String str){
//        for(char c : str.toCharArray()){
//            if(!Character.isUpperCase(c)){
//                return false;
//            }
//            if(!Character.isLowerCase(c)){
//                return false;
//            }
//        }
//        return true;
//    }

    public static void main(String[] args) {
//       String s ="aaa";
//        System.out.println(isallupercase(s));

        int []nums ={1,2,3,1};
        Arrays.sort(nums);
        for(int i= nums.length-1;i>=0;i--){
            System.out.println(i-1);
            break;
        }




    }
}
