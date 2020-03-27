package Homework;

public class Chapter19 {
    public static void main(String[] args) {
        int[][] matrix = new int[20][20];
        int sum = 0;
        int row = 0;
        int col = 0;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c <matrix[0].length; c++) {
                if(r == row || c == col){
                    sum += matrix[r][c];
                }
            }
        }
    }
}
