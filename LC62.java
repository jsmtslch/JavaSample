
public class LC62 {
    public static void main(String[] args) {
        int m = 3;
        int n = 2;
        int ans = 0;
        ans = helper(m,n,ans);
        System.err.println(ans);
    }

    private static int helper(int m, int n, int ans){
        if(m == 0 && n == 0){
            ans += 1;
            return ans;
        }
        if(m != 0 && n == 0)
            ans += helper(m-1,n,ans);
        if(n != 0 && m == 0)
            ans += helper(m, n-1, ans);
        if(m!= 0 && n != 0)
            ans += helper(m-1,n-1,ans);
        
        return ans;
    }

}