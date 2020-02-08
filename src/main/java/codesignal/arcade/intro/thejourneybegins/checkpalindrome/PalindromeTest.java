package codesignal.arcade.intro.thejourneybegins.checkpalindrome;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;


public class PalindromeTest {

    private Palindrome palindrome = new Palindrome();

    @ParameterizedTest
    @DisplayName("should be palindrome")
    @ValueSource(strings = {"aca", "aabaa", "a", "aia", "arara", "ovo", "TENET"})
    public void shoud_trueToPalindromeCheck_when_InputePalindrome(String stringToCheck) {
        assertThat(palindrome.checkPalindrome(stringToCheck)).isTrue();
    }

    @ParameterizedTest
    @DisplayName("should not be palindrome")
    @ValueSource(strings = {"abac", "lucas", "BRAZIL"})
    public void shoud_falseToPalindromeCheck_when_inputNoemalString(String stringToCheck) {
        assertThat(palindrome.checkPalindrome(stringToCheck)).isFalse();
    }
}
