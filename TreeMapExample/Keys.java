package TreeMapExample;

import java.util.Map;
import java.util.TreeMap;

public class Keys {
    public static void main(String[] args) {
        Map<String, String> tmap = new TreeMap<>();
        tmap.put("1", "Jay");
        tmap.put("2", "Sal");

        System.out.println("All keys: "+tmap.keySet());

        System.out.println("All values: "+tmap.values());

        Map<String, String> tmap1 = new TreeMap<>();
        tmap1.put("10", "Sid");
        tmap1.put("20", "Moo");

        System.out.println(tmap1.values());
        tmap1.clear();
        System.out.println("After clearing: "+tmap1.values());
    }
}