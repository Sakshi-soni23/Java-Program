
import java.util.Random;
import java.util.Scanner;
public class game {
    public static void main(String[] args) {
        System.out.println("ENTER 0-rock,1-paper,2-scissor ");
        Scanner sc =new Scanner(System.in);
        Random random = new Random();
        int computer= random.nextInt(3);
         int user= sc.nextInt();
        if((user==0)&&(computer==1)){
            System.out.println("computer is winner");
        }
        else if((user==1)&&(computer==0)){
            System.out.println("you are winner");
        }
        else if(user==computer){
            System.out.println("this is match is draw");
        }
        else if((user==1)&&(computer==2)){
            System.out.println("computer is winner");
        }
        else if((user==2)&&(computer==1)) {
            System.out.println("you are winner");
        }
        else if((user==2)&&(computer==0)){
            System.out.println("computer is winner");
        }
        else if((user==0)&&(computer==2)){
            System.out.println("you are winner");
        }
    }


    }

