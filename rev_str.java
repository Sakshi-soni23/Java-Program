public class rev_str {
    public static void main(String[] args) {
//        StringBuilder str = new StringBuilder("reverse the string");
//       for(int i=0;i<str.length()/2;i++){
//           int front = i;
//           int back = str.length()-1-i;
//           char frontchar = str.charAt(front);
//           char backchar = str.charAt(back);
//            str.setCharAt(front ,backchar);
//            str.setCharAt(back,frontchar);
//
//       }
//        System.out.println(str);
        String str = "for u";
        char [] ch = new char[str.length()];
        for(int i=str.length()-1;i>=0;i--){
            ch[i] =str.charAt(i);
            System.out.print(ch[i]);
        }

    }
}
