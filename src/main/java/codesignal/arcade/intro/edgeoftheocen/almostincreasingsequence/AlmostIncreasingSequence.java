package codesignal.arcade.intro.edgeoftheocen.almostincreasingsequence;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AlmostIncreasingSequence {

    private AlmostIncreasingSequence() {
        throw new IllegalStateException("Utility class");
    }

    public static Boolean solution(int[] sequence) {

        if (sequence.length == 2) {
            return true;
        }
        List<Integer> sequenceList = Arrays.stream(sequence).boxed().collect(Collectors.toList());
        for (int i = 0; i < sequence.length; i++) {
            if (i == 0 && sequence[i] > sequence[i + 1]) {
                sequenceList.remove(i);
                break;
            }

            if (i < 1 || (i < sequence.length -1 && sequence[i+1] <= sequence[i-1])) {
                continue;
            }

            if (i > 0 && sequence[i - 1] > sequence[i]
                    || i < sequence.length -1 && sequence[i - 1] == sequence[i]
                    ||(i < sequence.length -1 && sequence[i] > sequence[i+1] && sequence[i] > sequence[i-1])) {
                sequenceList.remove(i);
                break;
            }
        }

        for (int i = 0; i < sequenceList.size() - 1; i++) {
            if (sequenceList.get(i) >= sequenceList.get(i + 1)) {
                return false;
            }
        }

        return true;
    }
}
