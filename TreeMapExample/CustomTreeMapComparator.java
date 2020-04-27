package TreeMapExample;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class CustomTreeMapComparator {
    public static void main(String[] args) {
        Map<String, String> customMap = new TreeMap<>(new custom_key());
        customMap.put("C4", "Jay");
        customMap.put("D1", "Sal");
        customMap.put("A2", "Si");

        System.out.println("Ordering keys: "+ customMap.keySet());
        System.out.println("Ordering values: "+ customMap.values());
    }
}

class custom_key implements Comparator<String>{
    @Override
    public int compare(String s1, String s2){
        return s1.compareTo(s2);
    }
}