public class string_permutation {
    public static void printper(String s , String per){
        if(s.length() == 0){
            System.out.println(per);
            return;
        }
        for(int i=0; i<s.length();i++){
            char curchar = s.charAt(i);
            String str = s.substring(0,i)+s.substring(i+1);
            printper(str,per+curchar);
        }

    }
    public static void main(String[] args) {
String s ="abc";
printper(s,"");
    }
}
