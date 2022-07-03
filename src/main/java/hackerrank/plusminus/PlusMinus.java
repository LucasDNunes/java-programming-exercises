package hackerrank.plusminus;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class PlusMinus {

    public static void solution(List<Integer> arr) {
        double negativeNumbers = 0;
        double positiveNumbers = 0;
        double zeroNumbers = 0;
        double arraySize = arr.size();
        for (Integer integer : arr) {
            if (integer > 0) {
                positiveNumbers++;
            } else if (integer < 0) {
                negativeNumbers++;
            } else {
                zeroNumbers++;
            }
        }
        System.out.printf(Locale.US,"%.6f%n",positiveNumbers/arraySize);
        System.out.printf(Locale.US,"%.6f%n",negativeNumbers/arraySize);
        System.out.printf(Locale.US,"%.6f%n",zeroNumbers/arraySize);
    }

    public static void main(String[] args) {
        PlusMinus.solution(Arrays.asList(1,1,0,-1,-1));
    }
}
