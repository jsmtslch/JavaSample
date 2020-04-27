public class LC1409 {
    public static void main(String[] args) {
        int[] queries = {3,1,2,1};
        int m = 5;
        int [] ans = processQueries(queries, m);
        for(int i = 0 ; i < ans.length ; i++){
            System.out.println(ans[i]);
        }
    }

    public static int[] processQueries(int[] queries, int m) {
        int[] ans = new int[queries.length];
        int[] permuteArr = new int[m];
        for(int i = 0 ; i < m ; i++){
            permuteArr[i] = i+1;
        }
        for(int i = 0 ; i < queries.length ; i++){
            int numToBeFound = queries[i];
            for(int j = 0 ; j < permuteArr.length ; j++){
                if(numToBeFound == permuteArr[j]){
                    ans[i] = j;
                    break;
                }
            }
            for(int j = ans[i] ; j > 0 ; j--){
                permuteArr[j] = permuteArr[j-1];
            }
            permuteArr[0] = numToBeFound;
        }
        return ans;
    }
}