import java.util.Scanner;
public class pp1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter age1");
        /*
        char ch = input.next().charAt(0);
        if(ch >'a'&& ch<='z'){
            System.out.println("it is lowercase letter");

        }
        else{
            System.out.println("it is uppercase letter");
        }
    }

         */
        int age1 = input.nextInt();
        System.out.println("enter age2");
        int age2 = input.nextInt();
        System.out.println("enter age3");
        int age3 = input.nextInt();
        if (age1 > age2 && age1 > age3) {
            System.out.println(" your are older than  age 2 and age3");
        }
        //else{
        //System.out.println("younger");
        else if (age2 > age1 && age2 > age3) {
            System.out.println("your are older than age1 and age3");
        } else if (age3 > age1 && age3 > age2) {
            System.out.println("your are older than age1 and age2");
        } else {
            System.out.println("all have equal age");
        }
        if (age1<age2 && age1<age3){
            System.out.println("yor are younger than age2 and age3");
        }
        else if(age2<age1 && age2<age3){
            System.out.println("yor are younger than age1 and age3");
        }
        else if(age3<age1 && age3<age2){
            System.out.println("yor are younger than age2 and age1");
        }

    }
}

