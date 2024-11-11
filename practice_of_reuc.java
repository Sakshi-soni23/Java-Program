public class practice_of_reuc {
    public static void strlen(String  str , int ind){
        if(ind > str.length()){
            System.out.println(ind-1);
            return;
        }
       if(str.isEmpty()){
           System.out.println("0");
       }


strlen(str,ind+1);
    }
    public static void main(String[] args) {
        String str ="sawan";
        strlen(str,0);
    }
}
