class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        // Ex: input 2 if(matrix1 != matrix2) return same matrix1
        int rows = mat.length;
        int col = mat[0].length;
        if (rows * col != r * c) return mat;

        int[][] res = new int[r][c];
        int rowsCnt = 0;
        int colCnt = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                res[rowsCnt][colCnt] = mat[i][j];
                colCnt++;
                if (colCnt == c) {
                    colCnt = 0;
                    rowsCnt++;
                }
            }
        }

        return res;
    }

}