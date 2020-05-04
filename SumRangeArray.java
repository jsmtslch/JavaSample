
public class SumRangeArray {
    public static void main(String[] args) {
        int arr[] = {-1,2,3,4,5,6,10};

        HelperClass c = new HelperClass(arr);
        System.out.println(c.rangeSum(1, 5));
    }
}

class HelperClass{
    int[] arr;
    public HelperClass(int[] arr){
        this.arr = new int[arr.length];
        for(int i = 1 ; i < arr.length ; i++){
            this.arr[i] = arr[i-1]+arr[i];
        }
        this.arr[0] = arr[0];
    }

    public int rangeSum(int star, int end){
        return this.arr[end] - this.arr[end-1];
    }
}