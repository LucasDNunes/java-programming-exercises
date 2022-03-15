package codesignal.arcade.intro.smoothsailing.alllongeststrings;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class AllLongestStringsTest {

    @Test
    @DisplayName("should return a new array with longests strings")
    public void should_returnArrayWithLongestsStrings() {
        String[] array = new String[]{"aba", "aa", "ad", "vcd", "aba"};
        String[] longestStrings = new String[]{};
        longestStrings = AllLongestStrings.solution(array);
        Assertions.assertThat(longestStrings.length).isEqualTo(3);

        array = new String[]{"aa"};
        longestStrings = AllLongestStrings.solution(array);
        Assertions.assertThat(longestStrings.length).isEqualTo(1);

        array = new String[]{"abc", "eeee", "abcd", "dcd"};
        longestStrings = AllLongestStrings.solution(array);
        Assertions.assertThat(longestStrings.length).isEqualTo(2);

    }
}
