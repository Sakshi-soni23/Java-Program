//import java.sql.SQLOutput;
//import java.util.Scanner;
public class conditional {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the fist number");
//        double a = sc.nextDouble();
        /*
       int b;
        if (a >0){
            System.out.println("the is number positive");
        }
        else{
            System.out.println("the is number is negative");
        }

         */
        //problem2
        /*
        System.out.println("enter a value of b");
        double b = sc.nextDouble();
        System.out.println("enter the value of c");
        double c = sc.nextDouble();
        double d = (b*b) - (4*a*c);
            if(d>0) {
                double r1 = (-b + Math.sqrt(d)) / (2 * a);
                double r2 = (-b - Math.sqrt(d)) / (2 * a);
                System.out.println("roots " + r1 + " and root " + r2 + "");
            }
            else{
                System.out.println("the roots are not real" );
            }

         */
        //problem3
        /*
        System.out.println("enter the second number");
        double b = sc.nextDouble();
        System.out.println("enter the third number");
        double c = sc.nextDouble();
        if(a>b&&a>c)
        {
            System.out.println(a);
        }
        else if(b>c&&b>a){
            System.out.println(b);
        }
        else if(c>a&&c>b){
            System.out.println(c);
        }

         */
        System.out.println("star pattern");
        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j--){
                System.out.print("*");
            }
          System.out.println(" ");
        }




        }


    }

