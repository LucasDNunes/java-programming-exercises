package codesignal.arcade.intro.thejourneybegins.centuryfromyear;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CenturyFromYearTest {

    @Test
    public void should_centry17_when_year1700(){
        assertEquals(17, CenturyFromYear.getCenturyFromYear(1700));
    }

    @Test
    public void should_centry18_when_year1701(){
        assertEquals(18, CenturyFromYear.getCenturyFromYear(1701));
    }
}