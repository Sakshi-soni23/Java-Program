import java.util.HashSet;
import java.util.Iterator;

public class hash_set {
    public static void main(String[] args) {
        //creating a hashset
       HashSet<Integer> num = new HashSet<>();
        //add the element in the num set
num.add(45);
        System.out.println(num.size());
       num.remove(90); //delte the num 90
        if(num.contains(90))
        { //searching the eSystem.out.println("YES");
}        else{
            System.out.println("NO");
        }
        Iterator i = num.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
       }
        if(num.isEmpty()){
            System.out.println("empty");
        }
        else {
            System.out.println("it has element");
        }




    }
}
