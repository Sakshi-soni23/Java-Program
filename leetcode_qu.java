public class leetcode_qu {
    public  static boolean  isallupercase(String str){
        for(char c : str.toCharArray()){
            if(!Character.isUpperCase(c)){
                return false;
            }
            if(!Character.isLowerCase(c)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
       String s ="aaa";
        System.out.println(isallupercase(s));



    }
}
