import java.util.Scanner;

public class chapter_7 {
    /*
    static void table(int n){
        for(int i=1;i<=10;i++){
            int result = n*i;
            System.out.format("%d X %d = %d\n ", i,n, result);
        }

    }

    public static void main(String[] args) {
        table(2);
    }

     */
    static  void conversion(int b){
       float n = (b *1.8f)+32;
        System.out.println(n);

    }

    public static void main(String[] args) {
        conversion(10);

    }
}
