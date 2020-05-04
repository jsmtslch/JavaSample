import java.util.HashMap;

public class SmallestCommonSuperSeq {
    public static void main(String[] args) {
        String x = "ABCBDAB";
        String y = "BDCABA";
        long st1 = System.nanoTime();
        int ans = smallCommonSuperseq(x, y, x.length(), y.length());
        long et1 = System.nanoTime();

        System.out.println("Answer is:"+ans+" with elapsed time:"+(et1-st1));

        long st2 = System.nanoTime();
        int ans2 = smallCommonSuperseqMemo(x, y, x.length(), y.length());
        long et2 = System.nanoTime();

        System.out.println("Answer is:"+ans2+" with elapsed time:"+(et2-st2));
    }

    private static int smallCommonSuperseq(String x, String y, int i, int j) {
        if(i == 0 || j == 0){
            return i+j;
        }
        if(x.charAt(i-1) == y.charAt(j-1)){
            return smallCommonSuperseq(x, y, i-1, j-1)+1;
        }
        else{
            return Math.min(smallCommonSuperseq(x, y, i-1, j)+1, smallCommonSuperseq(x, y, i, j-1)+1);
        }
    }

    private static int smallCommonSuperseqMemo(String x, String y, int indexX, int indexY){
        HashMap<String, Integer> memo = new HashMap<>();
        if(indexX == 0 || indexY==0){
            return indexX+indexY;
        }
        if(memo.get(indexX+"-"+indexY) == null){
            int value;
            if(x.charAt(indexX-1) == y.charAt(indexY-1))
                value = smallCommonSuperseqMemo(x, y, indexX-1, indexY-1)+1;
            else
                value = Math.min(smallCommonSuperseqMemo(x, y, indexX-1, indexY)+1, smallCommonSuperseqMemo(x, y, indexX, indexY-1)+1);
            memo.put(indexX+"-"+indexY, value);
            return value;
        }
        else{
            return memo.get(indexX+"-"+indexY);
        }
    }
}