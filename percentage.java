import java.util.Scanner;
public class percentage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Taking Input");
        float subject1 = sc.nextFloat();
        float subject2 = sc.nextFloat();
        float subject3 = sc.nextFloat();
        float subject4 = sc.nextFloat();
        float subject5 = sc.nextFloat();
        float subject = ((subject1+subject2+subject3+subject4+subject5)*100)/500;
        System.out.println(subject);

    }

}
