
import java.util.Scanner;
public class statment {
    public static void main(String[] args) {
        //problem 1 to find maximum no.b/w 2 no.
        /*
        System.out.println("enter first number");
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter second number");
        int b =sc.nextInt();
        if(a>b &&  b<a){
            System.out.println(" a is maximum number from b");
        }
        else{
            System.out.println("b is maximum number from a");
        }
         */
//problem 2 to find maximum no.b\w three number
        /*
        System.out.println("ENTER  FIRST NUMBER");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("ENTER SECOND NUMBER");
        int b = sc.nextInt();
        System.out.println("ENTER THIRD NUMBER");
        int c =sc.nextInt();
        if(a>b && b<a){
            System.out.println("a is maximum");
        }
        else if(b>a && b<a ){
            System.out.println("b is maximum ");
        }
        else if(c>a || c>b){
            System.out.println("c is maximum");
        }
         */
        //problem 3 to check -ve ,+ve or zero number
        /*
        System.out.println("ENTER ANY NUMBER");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>0){
            System.out.println("this number is positive");
        }
        else if(num<0){
            System.out.println("this number is negative");
        }
        else if(num == 0){
            System.out.println("this number is zero");
        }

         */
        //problem 4 even or odd
        /*
        System.out.println("enter any number");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("it is even number");
        }
        else{
            System.out.println("it is odd number");
        }

         */
        //problem 5 no.is divisible by 5 and 11 or not
        /*
        System.out.println("ENTER ANY NUMBER");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num%5==0){
            System.out.println("it is divisible by 5");
        }
        else if(num%11==0){
            System.out.println("it is divisible by 11");
        }
        else{
            System.out.println("not divisible by 5 and 11");
        }

         */
        //problem 6 leap year
        /*
        System.out.println("ENTER ANY YEAR");
        Scanner sc =new Scanner(System.in);
        int year = sc.nextInt();
        if(year%4==0){
            System.out.println("THIS YEAR IS LEAP YEAR");
        }
        else{
            System.out.println("THIS IS NOT LEAP YEAR");
        }
         */
        //problem 7 week no. and day print
        /*
        System.out.println("enter your week no.");
        Scanner sc =new Scanner(System.in);
        int num = sc.nextInt();
        if(num==1){
            System.out.println("MONDAY");
        }
        else if(num==2){
            System.out.println("TUESDAY");
        }
        else if(num==3){
            System.out.println("WEDNESDAY");
        }
        else if(num==4){
            System.out.println("THURSDAY");
        }
        else if(num==5){
            System.out.println("FRIDAY");
        }
        else if(num==6){
            System.out.println("SATURDAY");
        }
        else if(num==7){
            System.out.println("SUNDAY");
        }

         */ //problem 8 triangles
        /*
        System.out.println("enter first angle");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("enter second angle");
        int b = sc.nextInt();
        System.out.println("enter third angle");
        int c = sc.nextInt();
        if(a==b && b==c && a==c ){
            System.out.println(" its equilateral triangle");
        }
        else if(a==b||b==c||a==c){
            System.out.println("its isosceles triangle");
        }
        else if(a!=b&&b!=c&&a!=c){
            System.out.println("its scalene triangle");
        } */ //problem 9 sp and cp
        /*
        System.out.println("enter the amount");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your selling price");
        int am1 = sc.nextInt();
        System.out.println("enter your cost price");
        int am2= sc.nextInt();
        if((am1-am2)<am1){
            System.out.println("you got profit");
        }
        else{
            System.out.println("you got loss");
        }
          */ //problem10 %
        /*
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the mark of maths");
        Byte m = sc.nextByte();
        System.out.println("enter the marks of physic");
        Byte p = sc.nextByte();
        System.out.println("enter the marks of chemistry");
         byte c =sc.nextByte();
        Float avg = (m+p+c)/3.0f;

        if (avg>=40){
           System.out.println("you are pass");
        }
      else if(avg<=33){
           System.out.println("you are boundary pass");
     }
      else if(avg<33){
          System.out.println("fail");
  }
  */ //problem 11// income tax
        /*
        System.out.println("enter your salary");
        Scanner sc = new Scanner(System.in);
        float tax = 0;
        float income = sc.nextFloat();
        if(income < 2.5){
            tax = tax + 0;
        }
        else if(income  > 2.5f && income < 5.0f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income  > 5.0f && income  < 10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if (income  > 10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax +  0.3f *(income- 10.0f);
        }
        System.out.println("total tax paid by employee" + tax);
          */
        //12problem gross salary calculate
        System.out.println("enter your basic salary");
        Scanner sc = new Scanner(System.in);
        float hr,da;
        int bs = sc.nextInt();

        if(bs <=10000){
            hr = bs*0.2f;
            da = bs * 0.8f;
        }
        else if(bs <=20000){
            hr = bs*0.25f;
            da = bs*0.9f;
        }
        else{
            hr = bs*0.3f;
            da = bs*0.95f;
        }
        System.out.println("tha gross salary is:" + (bs+hr+da));
    }
}
