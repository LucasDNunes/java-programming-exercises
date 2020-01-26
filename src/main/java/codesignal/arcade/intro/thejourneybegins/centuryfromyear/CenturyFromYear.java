package codesignal.arcade.intro.thejourneybegins.centuryfromyear;

public class CenturyFromYear {

    public static int getCenturyFromYear(int year) {
        return year % 100 == 0 ? year / 100 : (year / 100) + 1;
    }
}
