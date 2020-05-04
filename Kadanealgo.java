
public class Kadanealgo {
    public static void main(String[] args) {
        int[] arr = {-1,2,1,3,-9,5};
        int mg = arr[0], mc = arr[0];
        for(int i = 1 ; i < arr.length ; i++){
            mc = Math.max(arr[i], mc+arr[i]);
            if(mc > mg)
                mg = mc;
        }
        
        
        System.out.println("Max Subarray sum: "+mg);
    }
}