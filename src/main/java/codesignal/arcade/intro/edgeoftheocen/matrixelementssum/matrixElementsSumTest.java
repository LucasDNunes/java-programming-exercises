package codesignal.arcade.intro.edgeoftheocen.matrixelementssum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class matrixElementsSumTest {

    @Test
    @DisplayName("should calculate the matrixElementsSum")
    public void should_calculate(){
        int[][] matrix = {{0,1,1,2}, {0,5,0,0}, {2,0,3,3}};
        Assertions.assertEquals(9,MatrixElementsSum.solution(matrix));

        matrix = new int[][] {{1,1,1,0}, {0,5,0,1}, {2,1,3,10}};
        Assertions.assertEquals(9,MatrixElementsSum.solution(matrix));

        matrix = new int[][] {{1,1,1}, {2,2,2}, {3,3,3}};
        Assertions.assertEquals(18,MatrixElementsSum.solution(matrix));

        matrix = new int[][] {{0}};
        Assertions.assertEquals(0,MatrixElementsSum.solution(matrix));

        matrix = new int[][] {{1}, {5}, {0}, {2}};
        Assertions.assertEquals(6,MatrixElementsSum.solution(matrix));

    }
}
