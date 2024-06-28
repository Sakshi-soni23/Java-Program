import java.lang.reflect.Array;
import java.util.Arrays;
class gps{
    static boolean anagram(char[] str1,char[] str2){
        int n1= str1.length;
        int n2 =str2.length;
        if(n1!=n2){
            return false;
        }
        Arrays.sort(str1);
        Arrays.sort(str2);
        for(int i=0;i<n1;i++){
            if(str1[i]!=str2[i]){
                return false;
            }
        }
        return true;
    }
}
public class string_practice {
    public static void main(String[] args) {
//        String name = "sawan";
//        System.out.println(name.indexOf('a'));
        //q2 length of string word
        /*
        String name = "this is a tutorial";
        for(String word : name.split(" ")){
            if(word.length()%2==0){
                System.out.println(word);
            }
            else{
                System.out.println(" ");
            }} */
        //q3 store string in another string
        /*
        String s = "i hate u";
        String empty = new String() ;
        empty =s;
        System.out.println(empty);
          */
// is string palindrone or not
        /*
        String s = "abba";
        String empty = new String();
        for(int i=s.length()-1;i>=0;i--) {
            empty = empty+s.charAt(i);

        }
            if (empty.equals(s)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
              */
        char str1[] ={'L','I','S','T','E','N'};
        char str2 []={'S','I','L','E','N','T'};
        if(gps.anagram(str1,str2)){
            System.out.println("yes");
        }
        else {
            System.out.println("not");
        }
        }
    }

