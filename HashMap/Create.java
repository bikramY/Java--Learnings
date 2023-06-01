package HashMap;

import java.util.HashMap;
import java.util.Map;

public class Create {
    public static void main(String[] args) {
        HashMap<String,Integer> map= new HashMap<>();
        map.put("Nepal",13);
        map.put("India",1);
        map.put("Australia",2);
        map.put("Pakistan",3);
        System.out.println(map);
        map.remove("India");// remove a key and its value
        for(Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}
