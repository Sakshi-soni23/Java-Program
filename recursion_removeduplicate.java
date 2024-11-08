public class recursion_removeduplicate {
public static boolean[] map = new boolean[26];
public static void removeduplicate(String  s ,int i , String newstring){

    if(i == s.length()){
        System.out.println(newstring);
        return;
    }
    char currchar = s.charAt(i);
    if(map[currchar - 'a']){
        removeduplicate(s,i+1,newstring);
    }else{
        newstring += currchar;
        map[currchar - 'a'] = true;
        removeduplicate(s,i+1,newstring);
    }

}
    public static void main(String[] args) {
        String s ="bbcshwiuei";
        removeduplicate(s,0,"");

    }
}
