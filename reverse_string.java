public class reverse_string {
    public static void main(String[] args) {
        String s ="Let's take leetcode Content";
        String result ="";
        for(int i=s.length()-1;i>=0;i--){
            result+=s.charAt(i);
        }
        System.out.println(result);

    }
    }


