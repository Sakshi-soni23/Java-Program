import java.util.Scanner;

public class luckydraw_game {
    public static void main(String[] args) {
        System.out.println("welcome to our game lucky draws!!!!!");
        System.out.println("if you buy one box ,then you get  a color and according to that you will can win some gifts");
        System.out.println("choose any box between 1-5");
        Scanner sc = new Scanner(System.in);
        int box = sc.nextInt();
        switch (box){
            case 1:
                System.out.println("welcome you got blue color and u win the book sets");
                break;
            case 2:
                System.out.println(" your color is pink  your and you get pink dress ");
                break;
            case 3:
                System.out.println("you get red color and you are our 1 topper to get free goa trip");
                break;
            case 4:
                System.out.println("you get green color and your gift is one free box");
                break;
            case 5:
                System.out.println("you get yellow color and your gift if 3 pack of perfume");
                break;
            default:
                System.out.println("sorry you dont get anything");

        }




        }

    }

