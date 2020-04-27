import java.util.HashSet;
import java.util.Set;

public class LC1079{
    public static void main(String[] args) {
        
        Set<String> ans = new HashSet<>();
        permute("", "AAB", ans);
        for(String s : ans){
            System.out.println(s);
        }
    }

    private static void permute(String fixed, String unfixed, Set<String> ans) {
        ans.add(fixed);
        if(unfixed.length() == 0){
            return;
        }
        else{
            for(int i = 0 ; i < unfixed.length() ; i++){
                permute(fixed+String.valueOf(unfixed.charAt(i)), unfixed.substring(0, i)+unfixed.substring(i+1, unfixed.length()), ans);
            }
        }
    }
}