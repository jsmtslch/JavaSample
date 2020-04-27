package TreeMapExample;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapExample {
    public static void main(String[] args) {
        String[] strings = {"cat", "bat", "bat", "cat", "sat", "bat"};
        Map<String, Integer> hmap = new HashMap<>();
        Map<Integer, String> tmap = new TreeMap<>(Collections.reverseOrder());
        for(String s : strings){
            if(hmap.get(s) == null) 
                hmap.put(s, 1);
            else
                hmap.put(s  , hmap.get(s)+1);
        }

        for(Entry<String, Integer> e : hmap.entrySet()){
            tmap.put(e.getValue(), e.getKey());
        }

        for(Entry<Integer, String> e : tmap.entrySet()){
            System.out.println(e.getValue() +" "+ e.getKey());
        }
    }
}