import java.util.Scanner;

public class begnners {

        /*
        System.out.println("hello");
        Scanner sc = new Scanner(System.in);
        System.out.println("sakshi");

         */
        //problem 2
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.first");
        int a = sc.nextInt();
        System.out.println("Enter no.second");
        int b = sc.nextInt();
        int divide= a/b;
        System.out.println(divide);

         */
        /*
        int a=-5;
        int b=8;
        int c=6;
        int d =a+b*c;
        System.out.println(d);

         */
        /*
        Scanner sc = new Scanner(System.in);
        String st = "TANU";
        System.out.print("this is  my friend:");
        System.out.println(st);

         */
        //problem 3 to convert  string into lowercase
        /*
        String name= "SAWAN";89
        System.out.println(name.toLowerCase());

         */
        //problem 4 replace the spaces into underscores
        /*
String util = "      " ;
        System.out.println(util.replace(' ', '_'));

         */
        //problem 5 fill the letters
        /*
        String letter = "Dear< | name | >, thanks a lot";
        System.out.println(letter.replace("< | name | >","sawan"));
  */
        //problem 6 to detect double and triple space
        /*
        String yo =  "this is  double and   triple space";
        System.out.println(yo.indexOf("  "));
        System.out.println(yo.indexOf("   "));

         */
        //problem 7 escape sequence  character
//String letter =  "Dear Mr. sony ,\n\t your email is reach me and i m very thankful to u . because you accept my proposal,\nthanks a lot!!!";
//        System.out.println(letter);

        //problem 8
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter first integer");
//        int a = sc.nextInt();
//        System.out.println("enter second integer");
//        int b = sc.nextInt();
//        System.out.println("enter third integer");
//        int c =sc.nextInt();
//        System.out.println("enter fourth integer");
//        int d = sc.nextInt();
//        if(a!=b&&b!=c && c!=d){
//            System.out.println("not equal");
//        }else{
//            System.out.println("equal");
//        }
        //9
//        Boolean [][] arr ={{true,false,true},
//                {false,true,false}};
//        int row = arr.length;
//        int col = arr[0].length;
//        for(int i=0;i<row;i++){
//            for(int j=0;j<col;j++) {
//                if(arr[i][j]){
//                    System.out.print(" t ");
//                }
//                else{
//                    System.out.print(" f ");
//                }
//            }
//            System.out.println();
//        }

        //10
    public static  int largestinteger(int num){
        double logbase2 = Math.log(num)/Math.log(2);
        return (int)(Math.floor(logbase2));
    }
        public static void main(String[] args) {
        int num = 2530;
        int result =largestinteger(num);
            System.out.println("the largest integer but no largest than " +num+ " this "  +result);
    }
}
