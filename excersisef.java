//import java.sql.SQLOutput;
import java.util.Scanner;
public class excersisef {
    public static void main(String[] args) {
        //  System.out.println("enter your marks");
        // Scanner sc = new Scanner(System.in);
        // int a = 11;
        //a = sc.nextInt();
        //if (a == 11) {
        //  System.out.println("i am 11");
        //}
        //else {
        //  System.out.println("i am not 11");
        //}
        /*
        int m = sc.nextInt();
        if(m < 25){
            System.out.println("you get grade 'F'");
        }
        else if(m>25&&m<45){
            System.out.println("you get grade 'E'");
        }
        else if(m>45 && m<50){
            System.out.println("you get grade 'D'");
        }
        else if(m>50 && m<60){
            System.out.println("you get grade 'C'");
        }
        else if(m>60 &&m<80){
            System.out.println("you get grade 'B'");
        }
        else if(m>80){
            System.out.println("you get grade 'A'");
        }
        else{
            System.out.println("you are fail ");
        }  */
          System.out.println("ENTER THE BOOK NAME");
         Scanner sc = new Scanner(System.in);
         String book= sc.next();
        if (book.equals("maths")) {
            System.out.println("this book is available in section A");
            System.out.println(" store in NO. = 123");
        } else if (book.equals("english")) {
            System.out.println("THIS BOOK IS AVAILABLE IN SECTION 'A'");
            System.out.println("stored in  NO. = 124");
        } else if (book.equals("physics")) {
            System.out.println("THIS BOOK IS AVAILABLE IN SECTION 'A'");
            System.out.println("stored in NO. =125");
        } else if (book.equals("chemistry")) {
            System.out.println("THIS BOOK IS AVAILABLE IN SECTION 'A'");
            System.out.println("stored in  NO. =126");
        } else if (book.equals("spiritual")) {
            System.out.println("THIS BOOK IS AVAILABLE IN SECTION 'B'");
            System.out.println("stored in  NO. = 221");
        } else if (book.equals("political")){
            System.out.println("THIS BOOK IS AVAILABLE IN SECTION 'C'");
            System.out.println("stored in  NO. 331");
        } else if (book.equals("comic")) {
            System.out.println("THIS BOOK IS AVAILABLE IN SECTION 'D'");
            System.out.println("stored in  NO. 441");
        } else if (book.equals("knowledge")) {
            System.out.println("THIS BOOK IS AVAILABLE IN SECTION 'E'");
            System.out.println(" stored in NO. 551");
        } else if (book.equals("competitive")) {
            System.out.println("THIS BOOK IS AVAILABLE IN SECTION 'F'");
            System.out.println("stored in  NO. 661");
        }
    }

    }
