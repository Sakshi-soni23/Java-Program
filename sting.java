import java.util.Scanner;

public class sting {
    public static void main(String[] args) {
//        String name = "so";
//        /System.out.println(name.toLowerCase());
//        String  rate = "   hello";
//        System.out.println(rate.replace(' '  ,'_'));
//        String dear = " dear sun, \n\t thanks  ";
//        System.out.println(dear);
//        String space = "    ";
//        System.out.println(space.length());
        //chapter 4 conditional statement
//        int a =10;
//        if(a==11){
//            System.out.println("i am 11");
//        }
//        else{
//            System.out.println("i am not 11");
//        }
        // 2 question
//        Scanner sc = new Scanner(System.in);
//        int sub1 = sc.nextInt();
//        System.out.println("enter 2 subject marks");
//        int sub2 = sc.nextInt();
//        System.out.println("enter 3 subject marks");
//        int sub3 = sc.nextInt();
//        float total = (sub1+sub2+sub3)/3f;
//
//        if(total>40&&sub1>33&&sub2>33&&sub3>33){
//            System.out.println("you are pass");
//        }
//        else{
//            System.out.println("fail");
//        }
        //question 4
        /*
        System.out.println("enter any number between 1-7");
        Scanner sc = new Scanner(System.in);
        int week = sc.nextInt();
        switch(week){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            default:
                System.out.println("end");

        }

         */
        //question 5
        /*
        System.out.println("enter any year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if ( year %4 ==0) {
            System.out.println("it is leap year");
        }
        else {
            System.out.println("not leap year");
        }

         */
        //question 6
        /*
        System.out.println("enter any url between .com ,.org ,.in");
        Scanner s = new Scanner(System.in);
        String url = s.next();
        switch (url){
            case ".com":
                System.out.println(".com=commercial website");
                break;

            case ".org":
                System.out.println("full form of .org is: organization website");
                break;

            case".in":
                System.out.println(".in = indian website");
                break;


        }

         */
        //tax question
        System.out.println("enter your income in lakh");
        Scanner s = new Scanner(System.in);
        float tax =0;
        float income = s.nextFloat();
        if(income<=2.5f){
            tax = tax+income;
        }
        else if(income>2.5f&&income<=5.0f){
            tax= tax+0.05f*(income-2.5f);
        } else if (income>5.0f&&income<=10.0f) {
            tax= tax+0.05f*(5.0f-2.5f);
            tax = tax+0.2f*(income-5f);

        } else if (income>10.0f) {
            tax= tax+0.05f*(5.0f-2.5f);
            tax = tax+0.2f*(10.0f-5f);
            tax = tax+0.3f*(income-10.0f);

        }
        System.out.println(tax);

    }
}

