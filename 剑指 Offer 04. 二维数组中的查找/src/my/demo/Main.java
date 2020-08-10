package my.demo;

public class Main {

    public static boolean findNumberIn2DArray(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0) return false;
        int i = 0;
        int j = matrix[0].length - 1;
        for(;i < matrix.length && j >= 0;) {
            if(matrix[i][j] == target) return true;
            else if(matrix[i][j] < target) i++;
            else j--;
        }
            return false;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,   4,  7, 11, 15},
                {2,   5,  8, 12, 19},
                {3,   6,  9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };
//        int[][] matrix = {
//                {-1,   3}
//        };
        System.out.println(findNumberIn2DArray(matrix, 20));
    }
}
