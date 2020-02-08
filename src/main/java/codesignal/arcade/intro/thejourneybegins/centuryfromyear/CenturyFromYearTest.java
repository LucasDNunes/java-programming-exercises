package codesignal.arcade.intro.thejourneybegins.centuryfromyear;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CenturyFromYearTest {

    @Test
    public void should_centry17_when_year1700(){
        assertThat(CenturyFromYear.getCenturyFromYear(1700)).isEqualTo(17);
    }

    @Test
    public void should_centry18_when_year1701(){
        assertThat(CenturyFromYear.getCenturyFromYear(1701)).isEqualTo(18);
    }
}