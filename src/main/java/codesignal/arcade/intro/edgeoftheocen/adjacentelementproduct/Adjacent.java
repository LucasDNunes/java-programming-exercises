package codesignal.arcade.intro.edgeoftheocen.adjacentelementproduct;

public class Adjacent {

    public static int adjacentElementsProduct(int[] inputArray) {
        int previus = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < inputArray.length; i++) {
            if (i == 0) {
                previus = inputArray[i];
            } else if (previus * inputArray[i] > max) {
                max = previus * inputArray[i];
            }
            previus = inputArray[i];
        }

        return max;
    }
}
