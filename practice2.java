import java.util.Scanner;
public class practice2 {
    public static void main(String[] args){
        System.out.println("Taking Input");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name:");
        String name = sc.nextLine();
        System.out.println("enter field of interest:");
        String field= sc.nextLine();
        System.out.println("enter roll number:");
        int roll  = sc.nextInt();
        System.out.println("Hey,my name is  " + name + " and my roll number is " + roll +" my interest of field is "+ field + "");



    }

}
