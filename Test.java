import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
	    
	    // Get L and R from the input
		int L = s.nextInt();
		int R = s.nextInt();
    
        // Write here the logic to print all integers between L and R
        
        int N = R - L + 1;
		int[] numArray = new int[N];
        for(int i = 0 ; i < N ; i++){
			numArray[i] = s.nextInt();
		}
	String ans = "";
		for(int i = 0 ; i < numArray.length ; i++){
			ans = ans + numArray[i]+" ";
		}
        ans = ans.substring(0, ans.length());
        
		System.out.print(ans);

		s.close();
    }
}