import java.util.Scanner;

public class class6 {
    public static void main(String[] args){
  Scanner sc= new Scanner(System.in);
//        System.out.println("enter any number1");
//        double a=sc.nextDouble();
//        System.out.println("enter number2 ");
//        double b=sc.nextDouble();
//        double sum=a+b;
//        System.out.println(sum);
//        boolean a=sc.hasNextInt();
//        System.out.println(sc.hasNextInt());
        System.out.println("enter the no.1");
        int a=sc.nextInt();
        System.out.println("enter the 2 no.");
        int b =sc.nextInt();
        System.out.println("enter 3no.");
        int c=sc.nextInt();
        int solution = (a+b*c)/a;
        System.out.println(solution);
    }
}
