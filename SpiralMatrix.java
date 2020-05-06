public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int top = 0, bottom = mat.length-1, left = 0, right = mat[0].length-1;
        int dir = 0;
        while(top <= bottom && left <= right){
            if(dir == 0){
                for(int i = left; i <= right; i++){
                    System.out.println(mat[top][i]);
                }
                top += 1;
                dir = 1;
            }
            else if(dir == 1){
                for(int i = top ; i <= bottom ; i++){
                    System.out.println(mat[i][right]);
                }
                right -= 1;
                dir = 2;
            }
            else if(dir == 2){
                for(int i = right ; i >= left ; i--){
                    System.out.println(mat[bottom][i]);
                }
                bottom -= 1;
                dir = 3;
            }
            else if(dir == 3){
                for(int i = bottom; i >= top ; i--){
                    System.out.println(mat[i][left]);
                }
                left += 1;
                dir = 0;
            }
        }
    }
}