import java.util.Scanner;

public class condition_statement {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /*
        System.out.println("enter any number");
        int a = s.nextInt();
        if(a>=0){
            System.out.println("this number is positive :" +a);
        }
        else{
            System.out.println("this number is negative :" +a);
        }
         */
        /*
        System.out.println("enter a value");
      double  a = s.nextInt();
        System.out.println("enter b ");
    double b =s.nextInt();
        System.out.println("enter c ");
    double c = s.nextInt();
double result = b*b-4.0*a*c;
if(result >0.0){
    double r1 = ((-b+Math.pow(result,0.5))/2.0*a);
    double r2 =((-b-Math.pow(result,0.5))/2.0*a);
    System.out.println("root " +r1+ "and"+r2);
} else if (result==0.0) {
    double r1 = -b/(2.0*a);
    System.out.println("root" +r1);
}else{
    System.out.println("no real root");
}
   */
        /*
        System.out.println("enter a value");
        int a = s.nextInt();
        System.out.println("enter b ");
        int b =s.nextInt();
        System.out.println("enter c ");
        int c = s.nextInt();
        if(a>b&&a>c){
            System.out.println( "a is greatest "+a);
        } else if (b>a&&b>c) {
            System.out.println("b is greatest" +b);}
        else{
            System.out.println("c is is greatest");
        }
         */
        /*
        float a = s.nextFloat();
        float b = s.nextFloat();
        if(a==b){
            System.out.println("ture");
        }
        else{
            System.out.println("false");
        }
         */
        //print days in a month
        /*
        System.out.println("enter the month number");
        int n = s.nextInt();
        System.out.println("enter the year ");
        int year = s.nextInt();
        if(n==1||n==3||n==5||n==7||n==8||n==10||n==12){
            System.out.println("31 days"  +year);
        } else if (year%4==0) {
            System.out.println("29 days february");
        }else {
            System.out.println("30 days");
        }
          */
        System.out.println("ENTER A LETTER");
        String l = s.next();
        if(l.equals("a")||l.equals("e")||l.equals("i")||l.equals("o")||l.equals("u")||l.equals("A")||l.equals("E")||l.equals("I")||l.equals("O")||l.equals("U")){
            System.out.println("VOWEL");
        } else if (l.length()>1) {
            System.out.println("its not correct please enter new letter");}
        else {
            System.out.println("CONSONANT");
    }
    }
}
