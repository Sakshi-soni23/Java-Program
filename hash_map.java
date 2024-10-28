import java.util.HashMap;
import java.util.Set;

public class hash_map {
    public static void main(String[] args) {
        //find the size of the hashmap
        HashMap<String,Integer> map = new HashMap<>();
        map.put("RIYA",23);
        map.put("sapna",83);
        map.put("saraj",89);
        System.out.println(map.size());
        //remove all the mapping

//      map.clear();
//  System.out.println(map);

       // check key-value containing or not

        if(map.containsValue(83)){
            System.out.println("its present in the map");
        }else{
            System.out.println("its not present in the map");
       }
        //clone the map element

        HashMap<String,Integer> newmap = new HashMap<>();
        newmap = (HashMap)map.clone();
        System.out.println(newmap);
        //create a set
        Set  set = map.entrySet();
        System.out.println(set);

    }
}
