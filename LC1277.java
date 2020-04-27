
public class LC1277 {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,1,1},{1,1,1,1},{0,1,1,1}};
        int ans = countSquares(matrix);
        System.out.println(ans);
    }

    public static int countSquares(int[][] A) {
        int ans = 0;
        for(int i = A.length-1 ; i >=0 ; i--){
            for(int j = A[0].length-1 ; j >= 0 ; j--){
                if(A[i][j] != 0 && i < A.length-1 && j < A[0].length){
                    A[i][j] = Math.min(A[i+1][j+1], Math.min(A[i+1][j], A[i][j+1])) + 1;
                }
                ans += A[i][j];
            }
        }
        return ans;
    }
}