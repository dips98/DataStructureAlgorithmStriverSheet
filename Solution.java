class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i<row;i++){
            for (int j = 0; j<col;j++){
                if (matrix [i][j] == 0){
//                     set as row element as -1
                    for (int c = 0 ;c<col;c++){
                        if(matrix[i][c]!= 0)
                            matrix[i][c]= -25;
                    }
//                     set as column as -1
                    for (int r = 0;r<row;r++){
                        if(matrix[r][j]!= 0)
                            matrix[r][j] = -25;
                    }
                }
            }
        }
//         inserting 0 in place of -1
        for (int i = 0; i<row;i++){
            for (int j = 0; j<col;j++){
                if(matrix[i][j]==-25){
                    matrix[i][j]= 0;
                }
            }
        }
//         Printing the elements
        for (int i = 0; i<row;i++){
            for (int j = 0; j<col;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
