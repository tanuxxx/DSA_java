public class B12_matrix_formation {
    public static void main(String[] args) {
        int[][]matrix ={
                {2,4},
                {6,8}
        };
        for(int i =0; i< matrix.length;i++){
            for(int j=0; j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");  //print elements in rows and column
            }
            System.out.println();    //for the itteration
        }
    }
}
