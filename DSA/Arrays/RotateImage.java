import java.util.Arrays;

//Amazon
//https://leetcode.com/problems/rotate-image/description/

class RotateImage {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3}, {4,5,6}, {7,8,9}};
        flip(matrix);
        transpose(matrix);
        System.out.println(Arrays.deepToString(matrix));
    }
    
    static void flip(int[][] matrix) {
        int n = matrix.length;
            for (int i = 0; i < n/2; i++) {
                for (int j = 0; j < n; j++) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[n-i-1][j];
                    matrix[n-i-1][j] = temp;
                }
            }
        }
    static void transpose(int[][] matrix){
        int n = matrix.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    }
