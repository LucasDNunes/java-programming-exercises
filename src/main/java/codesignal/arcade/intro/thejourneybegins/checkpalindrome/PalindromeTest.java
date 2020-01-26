package codesignal.arcade.intro.thejourneybegins.checkpalindrome;

import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class PalindromeTest {

    private Palindrome palindrome = new Palindrome();

    @Test
    public void shoud_trueToPalindromeCheck_when_InputePalindrome() {
        assertTrue(palindrome.checkPalindrome("aca"));
        assertTrue(palindrome.checkPalindrome("aabaa"));
        assertTrue(palindrome.checkPalindrome("a"));
        assertTrue(palindrome.checkPalindrome("aia"));
        assertTrue(palindrome.checkPalindrome("arara"));
        assertTrue(palindrome.checkPalindrome("ovo"));
        assertTrue(palindrome.checkPalindrome("TENET"));
    }

    @Test
    public void shoud_falseToPalindromeCheck_when_inputNoemalString() {
        assertFalse(palindrome.checkPalindrome("abac"));
        assertFalse(palindrome.checkPalindrome("lucas"));
        assertFalse(palindrome.checkPalindrome("BRAZIL"));
    }
}
