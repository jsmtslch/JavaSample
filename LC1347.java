import java.util.HashMap;
import java.util.Map;

public class LC1347 {
    public static void main(String[] args) {
        System.out.println(minSteps("friend", "family"));
    }

    private static int minSteps(String s, String t) {
        int ans = 0;
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for(int i = 0 ; i < s.length() ; i++){
            if(sMap.get(s.charAt(i)) == null){
                sMap.put(s.charAt(i), 1);
            }else
                sMap.put(s.charAt(i), (sMap.get(s.charAt(i)) + 1));

            if(tMap.get(t.charAt(i)) == null)
                tMap.put(t.charAt(i), 1);
            else
                tMap.put(t.charAt(i), (tMap.get(t.charAt(i)) + 1));
        }
        for(Map.Entry<Character, Integer> entry : sMap.entrySet()){
            int countS = entry.getValue();
            int countT = tMap.get(entry.getKey()) == null ? 0 : tMap.get(entry.getKey());
            if(countS > countT)
                ans += countS - countT;
        }
        return ans;
    }
}