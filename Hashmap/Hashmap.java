
import java.util.HashMap;
import java.util.Set;
public class Hashmap {
    public static void main(String[] args){
        HashMap <String , Integer> map = new HashMap<>();

        map.put("India", 1);
        map.put("USA", 2);
        map.put("China", 3);
        System.out.println(map);
        
        System.out.println(map.get("India"));
        System.out.println(map.get("Pak"));

        //contains key
        System.out.println(map.containsKey("India"));
        System.out.println(map.containsKey("Pak"));

        //remove
        map.remove("China");
        System.out.println(map);

        //Iteration
        Set <String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key + " : " + map.get(key));
        }
    }

}
