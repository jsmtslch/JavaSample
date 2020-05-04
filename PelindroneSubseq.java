
public class PelindroneSubseq {
    public static void main(String[] args) {
        String s = "ABBDCACB";
        String ans = pelindromicSubString(s, 0, s.length()-1);
        System.out.println("Pelindromic String:"+ans);
    }

    public static String pelindromicSubString(String s, int start, int end){
        if(start > end || start < 0 || end < 0){
            return "";
        }
        if(start == end)
            return s.charAt(start)+"";
        if(s.charAt(start) == s.charAt(end)){
            return s.charAt(start) + pelindromicSubString(s, start+1, end-1) + s.charAt(end);
        }else{
            String s1 = pelindromicSubString(s, start+1, end);
            String s2 = pelindromicSubString(s, start, end-1);
            if(s1.length() >= s2.length())
                return s1;
            else
                return s2;
        }
    }
}