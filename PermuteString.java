import java.util.ArrayList;
import java.util.List;

public class PermuteString{
    public static void main(String[] args) {
        List<String> ans = new ArrayList<>();
        permute("", "ABC", ans);
        for(String s : ans){
            System.out.println(s);
        }
    }

    private static void permute(String fixed, String unfixed, List<String> ans) {
        if(unfixed.length() == 0){
            ans.add(fixed);
            return;
        }
        else{
            for(int i = 0 ; i < unfixed.length() ; i++){
                permute(fixed+String.valueOf(unfixed.charAt(i)), unfixed.substring(0, i)+unfixed.substring(i+1, unfixed.length()), ans);
            }
        }
    }
}