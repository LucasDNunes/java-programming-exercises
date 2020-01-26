package codesignal.arcade.intro.thejourneybegins.checkpalindrome;

public class Palindrome {

    public boolean checkPalindrome(String checkPalindrome) {
        String stringReverse = new StringBuffer(checkPalindrome).reverse().toString();
        return stringReverse.equals(checkPalindrome);
    }
}
