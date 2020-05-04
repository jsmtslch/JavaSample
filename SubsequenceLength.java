
public class SubsequenceLength {
    public static void main(String[] args) {
        String s = "abc";
        String t = "asbdcf";
        System.out.println(maxSubSeqLength(s,t, s.length()-1, t.length()-1));

        System.out.println("With Memoization:"+ maxSubSeqMemo(s, t));
    }

    private static int maxSubSeqLength(String s, String t, int indexS, int indexT){
        if(indexS < 0 || indexT < 0){
            return 0;
        }
        if(s.charAt(indexS) == t.charAt(indexT)){
            return 1+maxSubSeqLength(s, t, indexS-1, indexT-1);
        }
        else{
            return Math.max(maxSubSeqLength(s, t, indexS-1, indexT), maxSubSeqLength(s, t, indexS, indexT-1));
        }
    }

    private static int maxSubSeqMemo( String s, String t){
        int[][] memo = new int[s.length()+1][t.length()+1];
        for(int i = 1 ; i <= s.length() ; i++){
            for(int j = 1 ; j <= t.length() ; j++){
                if(s.charAt(i-1) == t.charAt(j-1)){
                    memo[i][j] = 1+memo[i-1][j-1];
                }else{
                    memo[i][j] = Math.max(memo[i-1][j], memo[i][j-1]);
                }
                
            }
        }
        return memo[s.length()][t.length()];
    }
}