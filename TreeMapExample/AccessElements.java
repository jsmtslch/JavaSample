package TreeMapExample;

import java.util.Collections;
import java.util.TreeMap;

public class AccessElements {
    public static void main(String[] args) {
        TreeMap<Integer, String> tmap = new TreeMap<>(Collections.reverseOrder());
        tmap.put(2, "Jay");
        tmap.put(1, "Sal");
        tmap.put(4, "Har");
        tmap.put(3, "Ram");

        System.out.println("First Element:"+ tmap.firstEntry());

        System.out.println("Last Value: "+tmap.pollFirstEntry().getValue());

        System.out.println("Last Value: "+tmap.pollFirstEntry().getValue());

        System.out.println("Last Value: "+tmap.pollFirstEntry().getValue());

        System.out.println("Last Value: "+tmap.pollFirstEntry().getValue());

        if(!tmap.isEmpty())
            System.out.println("Last Value: "+tmap.pollFirstEntry().getValue());
    }
}