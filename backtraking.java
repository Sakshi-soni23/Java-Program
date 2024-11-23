public class backtraking {
    public static void printpermutation(String s ,String prem ,int index){
        if(s.length() == 0){
            System.out.println(prem);
            return;
        }
        for (int i=0 ;i <s.length();i++){
            char curr = s.charAt(i);
            String str = s.substring(0,i) + s.substring(i+1);
            printpermutation(str,prem+curr,index+1);
        }

    }
    public static void main(String[] args) {
        String  s ="ABC";
        printpermutation(s,"",0);
    }
}
