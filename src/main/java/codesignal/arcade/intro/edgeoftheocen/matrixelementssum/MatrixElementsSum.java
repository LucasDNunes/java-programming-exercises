package codesignal.arcade.intro.edgeoftheocen.matrixelementssum;

public class MatrixElementsSum {

    public static int solution(int[][] matrix) {

        int totalAmount = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
                if (i == 0 && matrix[i][j] != 0) {
                    totalAmount += matrix[i][j];
                }
                if (i >= 1 && matrix[i][j] != 0) {
                    boolean hasSum = true;
                    for (int k = 0; k < i; k++) {
                        if (matrix[i- (k+1)][j] == 0) {
                            hasSum = false;
                            break;
                        }
                    }
                    if (hasSum){
                        totalAmount += matrix[i][j];
                    }
                }
            }
            System.out.println();
        }
        System.out.println("total amount = "+ totalAmount);
        return totalAmount;
    }
}
