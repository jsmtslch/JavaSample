import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LC1415 {
    private static final char[] ref = {'a','b','c'};

    public static void main(String[] args) {
        getHappyString(2,7);
    }

    public static String getHappyString(int n, int k) {
        List<String> strings = permute("", n, new ArrayList<String>());
        Collections.sort(strings);
        return strings.size() >= (k-1) ? strings.get(k-1) : "";
    }
    
    private static List<String> permute(String prefix, int n, List<String> strings){
        if(prefix.length() == n){
            strings.add(prefix);
        }else{
            for(int i = 0 ; i < ref.length ; i++){
                if(prefix.length() == 0 || prefix.charAt(prefix.length()-1) != ref[i]){
                    permute(prefix+ref[i], n, strings);
                }
            }
        }
        return strings;
    }
}