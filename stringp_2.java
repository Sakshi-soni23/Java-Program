import java.util.Arrays;
import java.util.Scanner;

public class stringp_2 {
    public static void main(String[] args){
        /*
        String name = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i=name.length()-1;i>=0;i--){
            System.out.println(name.charAt(i));
        }

         */
        //swaping the string
        /*
        String s ="Geeksforgeeks";
       char[] n= s.toCharArray();
        for(int i=0;i<s.length()-1;i+=2){
            char temp =n[i];
            n[i]=n[i+1];
            n[i+1]=temp;
        }
        System.out.println(n);

         */ //replace the char on index
        /*
        String str = "harry";
       StringBuilder ch= new StringBuilder("harry");
       ch.setCharAt(0,'H');
        System.out.println(ch);
         */
//remove the zeroes from starting
        /*
        String n = "0000123";
       int i = 0;
            while(n.charAt(i) !=0){
                i++;
            }
                String s = n.substring(i,n.length());
                System.out.println(s);

         */
        //cpmpareing 2 string
        String  r1= "Geek";
        String r2 ="Geek";
        System.out.println(r1.equals(r2));
    }
    }

