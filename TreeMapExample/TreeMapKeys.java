package TreeMapExample;

import java.util.NavigableSet;
import java.util.TreeMap;

public class TreeMapKeys {
    public static void main(String[] args) {
        TreeMap<Integer, String> tmap = new TreeMap<>();
        tmap.put(4, "Jay");
        tmap.put(2, "Sal");
        tmap.put(3, "Har");
        tmap.put(0, "Nav");

        System.out.println("This will print only the higher key: "+tmap.higherKey(3));

        System.out.println("This will pring higher entry: "+ tmap.higherEntry(3));

        System.out.println("This will print greatest entry lesser than given key: "+tmap.lowerEntry(3));

        System.out.println("This will print greatest key lesser than given key: "+tmap.lowerKey(3));

        System.out.println("This is navigable key set:"+tmap.navigableKeySet());

        NavigableSet<Integer> navSet = tmap.navigableKeySet();

        System.out.println(navSet.lower(4));

        System.out.println("Polling the first(lower entry): "+tmap.pollFirstEntry());

        System.out.println("Pooling the last(highest entry):"+tmap.pollLastEntry());

        tmap.put(4, "Jay");
        tmap.put(2, "Sal");
        tmap.put(3, "Har");
        tmap.put(0, "Nav");

        System.out.println(tmap.subMap(1, 3));

        System.out.println("Submap whose key is greater than equal to given key:"+tmap.tailMap(2));

        System.out.println("Submap whose key is greater than given key:"+tmap.tailMap(2, false));

        System.out.println("Least value greater than equal to the given key:"+tmap.ceilingEntry(1));
    }
}