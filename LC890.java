import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC890 {

    public static void main(String[] args) {
        String[] words = {"abc","deq","mee","aqq","dkd","ccc"};
        String pattern = "abb";
        List<String> ans = findAndReplacePattern(words, pattern);
        System.out.println(ans);
    }


    public static List<String> findAndReplacePattern(final String[] words, final String pattern) {
        final List<String> ans = new ArrayList<>();
        for(int i = 0 ; i < words.length ; i++){
            Map<Character, Character> refMap = new HashMap<>();
            Map<Character, Character> revRefMap = new HashMap<>();
            final String word = words[i];
            for(int j = 0 ; j < pattern.length() ; j++){
                if( refMap.get(pattern.charAt(j)) == null){
                    if(revRefMap.get(word.charAt(j)) != null)
                        break;
                    else{
                        refMap.put(pattern.charAt(j), word.charAt(j));
                        revRefMap.put(word.charAt(j), pattern.charAt(j));
                    }
                }else if(refMap.get(pattern.charAt(j)) != null && refMap.get(pattern.charAt(j)) != word.charAt(j)){
                    break;
                }
                if(j == (pattern.length()-1)){
                    ans.add(word);
                }
            }
        }
        return ans;
    }
}