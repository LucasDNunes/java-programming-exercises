package codesignal.arcade.intro.smoothsailing.alllongeststrings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllLongestStrings {

    public static String[] solution(String[] inputArray) {
        int amountStrings = 0;
        int longestString = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (longestString < inputArray[i].length()) {
                longestString = inputArray[i].length();
                amountStrings ++;
            }
        }

        List<String> listLongestString = new ArrayList<String>();
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].length() == longestString) {
                listLongestString.add(inputArray[i]);
            }
        }
        String[] strings = new String[listLongestString.size()];
        return listLongestString.toArray(strings);

    }
}
