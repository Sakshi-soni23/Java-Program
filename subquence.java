public class subquence {
    public static void subquence(String str , int ind , String newstr){
        if(ind == str.length()){
            System.out.println(newstr);
            return;
        }
char currchar = str.charAt(ind);
//character to be
        subquence(str , ind+1, newstr+currchar);
        //character not to be
        subquence(str,ind+1,newstr);


    }
    public static void main(String[] args) {
        String str = "ab";
        subquence(str,0,"");
    }
}
