import javax.imageio.stream.ImageInputStream;

public class recur_prs {
//    public static void print(int n){
//  if(n==6){
//    return;
//}
// System.out.println(n);
//        print(n+1);
//    }

//    public static void  factorial(int n, int fact){
//        if(n == 1){
//            System.out.println(fact);
//            return;
//        }
//        fact *= n;
//        factorial(n-1,fact);
//    }

    //fibonaciseries
//    public static void fibo(int a ,int b ,int n){
//        if(n == 0){
//            return;
//        }
//      int  c =a+b;
//        System.out.println(c);
//        fibo(b,c,n-1);
//
//    }

//    public static int print(int x ,int n){
//        if(n==0){
//            return 1;
//        }
//        if(x==0){
//            return 0;
//        }
//        //n == even
//        if(n %2==0){
//            return print(x ,n/2)*print(x ,n/2);
//        }
//        else{
//            return print(x ,n/2)*print(x ,n/2)*x;
//        }
//    }

    public static void reversestring(String s ,int i){
        if(i == 0){
            System.out.println(s.charAt(i));
            return;
        }
        System.out.println(s.charAt(i));
        reversestring(s,i-1);
    }

        public static void main(String[] args){
//          int ans =print(2,2);
//            System.out.println(ans);
            String s ="ab";
            int i=s.length()-1;
            reversestring(s,i);


    }
}