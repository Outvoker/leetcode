public class Solution {
    public int[] spiralOrder(int[][] matrix) {
        if(matrix.length == 0) return new int[0];
        int[] direct_i = {0, 1, 0, -1}, direct_j = {1, 0, -1, 0};
        int k = 0, m = 0, n = 0, l = 0;
        int[] change = new int[2];
        change[0] = matrix[0].length;
        change[1] = matrix.length;
        int[] res = new int[change[0] * change[1]];
        int i = 0, j = 0;
        while(k < matrix.length * matrix[0].length) {
            while(n < change[l]){
                res[k] = matrix[i][j];
                k++;
                n++;
                i += direct_i[m];
                j += direct_j[m];
            }
            switch(m) {
                case 0: j--; i++;break;
                case 1: i--; j--;break;
                case 2: j++; i--;break;
                case 3: i++; j++;break;
            }
            m = (m + 1) % 4;
            l = (l + 1) % 2;
            change[l]--;
            n = 0;
        }
        return res;
    }
}
